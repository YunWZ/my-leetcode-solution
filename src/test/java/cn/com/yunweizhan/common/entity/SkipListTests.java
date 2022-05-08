package cn.com.yunweizhan.common.entity;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/7 15:40
 */
class SkipListTests extends BaseTests {

	private SkipList<Integer> init() {
		SkipList<Integer> skipList = new SkipList<>(Integer::compareTo);
		return skipList.add(1).add(3).add(7).add(9)
				.add(8).add(6).add(4).add(2);
	}

	@Test
	void getLength() {
		SkipList<Integer> init = init();
		assert init.getLength() == 8;
		printArray(init.toArray());
	}

	@Test
	void add() {
		SkipList<Integer> init = init();
		init.add(5);
		assert init.has(5);
		printArray(init.toArray());

		init.add(11);
		assert init.has(11);
		printArray(init.toArray());

		init.add(-1);
		assert init.has(-1);
		printArray(init.toArray());
	}

	@Test
	void has() {
		SkipList<Integer> init = init();
		assert init.has(2);
	}

	@Test
	void delete() {
		SkipList<Integer> init = init();

		assert !init.delete(11);
		assert init.getLength() == 8;
		printArray(init.toArray());

		assert !init.delete(-11);
		assert init.getLength() == 8;
		printArray(init.toArray());

		init.delete(3);
		assert !init.has(3);
		assert init.getLength() == 7;
		printArray(init.toArray());
	}

}