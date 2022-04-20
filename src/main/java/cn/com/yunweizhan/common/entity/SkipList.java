package cn.com.yunweizhan.common.entity;

import java.util.Comparator;
import java.util.Random;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 18:25
 */
public class SkipList<T extends Comparable<T>> {
	public static final int MAX_LEVEL = 32;
	private int level;
	private int length;
	private SkipListNode<T> header, tail;
	private final Random random = new Random(System.currentTimeMillis());
	private Comparator<T> comparator;

	public SkipList() {
		this(null);
	}

	public SkipList(Comparator<T> comparator) {
		this.level = randomLevel();
		this.header = new SkipListNode<>(null, null, this.level);
		this.tail = null;
		this.length = 0;
		this.comparator = comparator;
	}

	public int getLength() {
		return length;
	}

	public void add(T value) {
		if (null == value) {
			return;
		}
		int i, level;
		SkipListNode<T> x = this.header;
		SkipListNode<T>[] update = new SkipListNode[MAX_LEVEL];

		for (i = this.level - 1; i >= 0; i--) {
			while (x.level[i].forward != null
					&& compare(x.level[i].forward.value, value) < 0) {
				x = x.level[i].forward;
			}
			update[i] = x;
		}

		level = randomLevel();
		for (int j = this.level; j < level; j++) {
			update[j] = this.header;
		}
		x = new SkipListNode<>(value, null, level);
		this.level = level;

		for (int j = 0; j < level; j++) {
			x.level[j].forward = update[j].level[j].forward;
			update[j].level[j].forward = x;
		}

		x.backward = update[0] == this.header ? null : update[0];

		if (x.level[0].forward != null) {
			x.level[0].forward.backward = x;
		}
		else {
			this.tail = x;
		}

		this.length++;
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

	public void delete(T value) {
		SkipListNode<T> x = this.header;
		SkipListNode<T>[] update = new SkipListNode[MAX_LEVEL];
		for (int i = this.level - 1; i >= 0; i--) {
			while (x.level[i].forward != null && compare(x.level[i].forward.value, value) < 0) {
				x = x.level[i].forward;
			}
			update[i] = x;
		}

		x = x.level[0].forward;
		if (compare(x.value, value) != 0) {
			return;
		}

		for (int i = 0; i < this.level; i++) {
			x.level[i].forward.backward = update[i];
			update[i].level[i].forward = x.level[i].forward;
		}

		while (this.level > 1 && this.header.level[this.level].forward == null) {
			this.level--;
		}
		this.length--;
	}

	private int compare(T v1, T v2) {
		return comparator != null ? comparator.compare(v1, v2) : v1.compareTo(v2);
	}

	public static <T extends Comparable<T>> SkipList<T> skipList() {
		return new SkipList<>();
	}

	public class SkipListNode<T> {
		private T value;
		private SkipListNode<T> backward;
		private SkipListNodeLevel<T>[] level;

		SkipListNode(T value, SkipListNode<T> backward, int level) {
			this.value = value;
			this.backward = backward;
			this.level = new SkipListNodeLevel[level];
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
