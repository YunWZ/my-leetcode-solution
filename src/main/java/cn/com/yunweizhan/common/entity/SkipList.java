package cn.com.yunweizhan.common.entity;

import java.util.Comparator;
import java.util.Random;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 18:25
 */
public class SkipList<T extends Comparable<T>> {
	public static final int MAX_LEVEL = 32;
	public static final int MIN_LEVEL = 1;
	private int level;
	private int length;
	private final SkipListNode<T> header;
	private SkipListNode<T> tail;
	private final Random random = new Random(System.currentTimeMillis());
	private final Comparator<T> comparator;

/*	public SkipList() {
		this(null);
	}*/

	public SkipList(Comparator<T> comparator) {
		this.level = MIN_LEVEL;
		this.length = 0;
		this.header = new SkipListNode<>(null, null, MAX_LEVEL);
		this.tail = null;
		this.comparator = comparator;
	}

	public int getLength() {
		return length;
	}

	public SkipList<T> add(T value) {
		if (null == value) {
			return this;
		}

		SkipListNode<T>[] update = searchPreNode(value);

		int level;
		//如果当前节点层级高于跳表高度,则设置x.level[this.level~level]为头结点
		if ((level = randomLevel()) > this.level) {
			for (int j = this.level; j < level; j++) {
				update[j] = this.header;
			}
			this.level = level;
		}

		SkipListNode<T> x = new SkipListNode<>(value, null, level);

		for (int j = 0; j < level; j++) {
			x.level[j].forward = update[j].level[j].forward;
			update[j].level[j].forward = x;
		}

		//如果当前节点是跳表中的第一个元素,则backward设置为null
		x.backward = update[0] == this.header ? null : update[0];

		if (x.level[0].forward != null) {
			x.level[0].forward.backward = x;
		}
		else {
			this.tail = x;
		}

		this.length++;

		return this;
	}

	private SkipListNode<T>[] searchPreNode(T value) {
		SkipListNode<T> x = this.header;
		SkipListNode<T>[] update = new SkipListNode[MAX_LEVEL];
		for (int i = this.level - 1; i >= 0; i--) {
			while (x.level[i].forward != null
					&& compare(x.level[i].forward.value, value) < 0) {
				x = x.level[i].forward;
			}
			update[i] = x;
		}

		return update;
	}

	public T[] toArray() {
		T[] array = (T[]) new Object[length];
		SkipListNode<T> x = header;
		int i = 0;
		while (x.level[0].forward != null) {
			x = x.level[0].forward;
			array[i++] = x.value;
		}
		return array;
	}

	public T[] toReverseArray() {
		T[] array = (T[]) new Object[length];
		SkipListNode<T> x = tail;
		int i = 0;
		while (x != null && x.backward != null) {
			array[i++] = x.value;
			x = x.backward;
		}

		return array;
	}

	public boolean has(T value) {
		SkipListNode<T> x = this.header;

		int level = this.level;

		for (int i = level - 1; i >= 0; i--) {
			while (x.level[i].forward != null && compare(x.level[i].forward.value, value) < 0) {
				x = x.level[i].forward;
			}
		}

		x = x.level[0].forward;
		return x != null && compare(x.value, value) == 0;
	}

	public boolean delete(T value) {
		SkipListNode<T> x;
		SkipListNode<T>[] update = searchPreNode(value);

		x = update[0].level[0].forward;
		if (x == null || compare(x.value, value) != 0) {
			return false;
		}

		for (int i = 0; i < x.level.length; i++) {
			if (x.level[i] != null) {
				x.level[i].forward.backward = update[i];
				update[i].level[i].forward = x.level[i].forward;
			}
		}

		while (this.level > 1 && this.header.level[this.level].forward == null) {
			this.level--;
		}
		this.length--;

		return true;
	}

	private int compare(T v1, T v2) {
		return comparator != null ? comparator.compare(v1, v2) : v1.compareTo(v2);
	}

	public class SkipListNode<T> {
		private T value;
		private SkipListNode<T> backward;
		private final SkipListNodeLevel<T>[] level;

		SkipListNode(T value, SkipListNode<T> backward, int level) {
			this.value = value;
			this.backward = backward;
			this.level = new SkipListNodeLevel[level];

			for (int i = 0; i < level; i++) {
				this.level[i] = new SkipListNodeLevel<>();
			}
		}

		public T getValue() {
			return value;
		}

		public SkipListNode<T> getBackward() {
			return backward;
		}

		public SkipListNodeLevel<T>[] getLevel() {
			return level;
		}
	}

	private int randomLevel() {
		int level = 1;
		while (random.nextBoolean()) {
			level++;
		}
		return level;
	}

	public class SkipListNodeLevel<T> {
		private SkipListNode<T> forward;

		public SkipListNode<T> getForward() {
			return forward;
		}
	}
}
