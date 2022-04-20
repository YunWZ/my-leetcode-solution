package cn.com.yunweizhan.thread;

import java.util.HashMap;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/12 19:42
 */
public class HashMapTest {

	public void testHashBin() {
		HashMap<Integer, Integer> s = new HashMap<>();
		for (int i = 1; i < 10; i++) {
			s.put(16 * (1 << i), i);
		}

	}
}
