package cn.com.yunweizhan.common.entity;

import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 17:44
 */
public class Window {
	private int sampleCount;
	private int intervalInMs;
	private long windowLenghtInMs;
	private AtomicReferenceArray<WindowWrp<Integer>> array;

	public Window(int sampleCount, int intervalInMs) {
		this.sampleCount = sampleCount;
		this.intervalInMs = intervalInMs;
		this.windowLenghtInMs = intervalInMs / sampleCount;
		this.array = new AtomicReferenceArray<>(sampleCount);
	}

	private int getTimeIdx(long timestamp) {
		long timeIdx = timestamp / windowLenghtInMs;
		return (int) timeIdx % array.length();
	}

	public long getWindowStart(long timestamp) {
		return timestamp - timestamp % windowLenghtInMs;
	}

	public void put(long timestamp, int count) {
		if (timestamp < 0) {
			return;
		}
		int timeIdx = getTimeIdx(timestamp);
		long windowStart = getWindowStart(timestamp);
		WindowWrp<Integer> integerWindowWrp = array.get(timeIdx);

		while (true) {
			if (integerWindowWrp.windowStart == windowStart) {
				integerWindowWrp.value++;
				return;
			}
			else if (integerWindowWrp.windowStart > windowStart) {
				return;
			}
			else {
				integerWindowWrp.windowStart = windowStart;
				integerWindowWrp.value = 0;
			}
		}
	}

	public class WindowWrp<T> {
		private final long windowLenghtInMs;
		private long windowStart;
		private T value;

		WindowWrp(long windowLenghtInMs, long windowStart, T value) {
			this.windowLenghtInMs = windowLenghtInMs;
			this.windowStart = windowStart;
			this.value = value;
		}
	}
}
