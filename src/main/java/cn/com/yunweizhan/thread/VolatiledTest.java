package cn.com.yunweizhan.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/9 10:07
 */
public class VolatiledTest {
	private static volatile Map<Integer, Integer> map;
	private static final Object LOCK = new Object();

	private void put(Integer integer) {
		if (map == null) {
			synchronized (LOCK) {
				if (map == null) {
					map = new HashMap<>();
				}
			}
		}
		map.put(integer, integer);
		sleepOneSec();
	}

	private Set<Integer> keys() {
		sleepOneSec();
		return map.keySet();
	}

	private void sleepOneSec() {
		long endTime = System.currentTimeMillis() + 1000L;
		while (System.currentTimeMillis() < endTime) {
			//do no thing
		}
	}

	public static void main(String[] args) {
		VolatiledTest instance = new VolatiledTest();
		Thread write = new Thread(() -> {
			System.out.println("writeThread started.");
			int i = 0;
			while (i++ < 30) {
				instance.put(i);
				System.out.println("writeThread puted: " + i);
			}
		});

		Thread readThread = new Thread(() -> {
			System.out.println("readThread started.");
			int i = 0;
			while (i++ < 30) {
				System.out.println("readThread get keys: " + instance.keys());
			}
		}); Thread readThread2 = new Thread(() -> {
			System.out.println("readThread2 started.");
			int i = 0;
			while (i++ < 30) {
				System.out.println("readThread2 get keys: " + instance.keys());
			}
		}); Thread readThread3 = new Thread(() -> {
			System.out.println("readThread3 started.");
			int i = 0;
			while (i++ < 30) {
				System.out.println("readThread3 get keys: " + instance.keys());
			}
		}); Thread readThread4 = new Thread(() -> {
			System.out.println("readThread4 started.");
			int i = 0;
			while (i++ < 30) {
				System.out.println("readThread4 get keys: " + instance.keys());
			}
		}); Thread readThread5 = new Thread(() -> {
			System.out.println("readThread5 started.");
			int i = 0;
			while (i++ < 30) {
				System.out.println("readThread5 get keys: " + instance.keys());
			}
		});

		readThread.start();
		readThread2.start();
		readThread3.start();
		readThread4.start();
		readThread5.start();

		write.start();
	}
}
