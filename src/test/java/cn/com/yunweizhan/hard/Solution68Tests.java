package cn.com.yunweizhan.hard;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/3 16:06
 */
class Solution68Tests {
	public static final Solution68 instance = new Solution68();

	@Test
	void fullJustify() {

		test(new String[] {"This", "is", "an", "example", "of", "text", "justification."}, 16,
				new String[] {"This    is    an",
						"example  of text",
						"justification.  "});

		test(new String[] {"What", "must", "be", "acknowledgment", "shall", "be"}, 16, new String[] {"What   must   be",
				"acknowledgment  ",
				"shall be        "});
	}

	private void test(String[] source, int maxWidth, String[] expected) {
		assert equal(instance.fullJustify(source, maxWidth), expected);
	}

	private boolean equal(List<String> fullJustify, String[] expected) {
		int i = 0;
		Iterator<String> iterator = fullJustify.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
//			System.out.println("line length: " + next.length());
			if (!next.equals(expected[i++])) {
				System.out.println("expected:" + expected[i - 1] + ", actual: " + next + ".");
				return false;
			}
		}
		return true;
	}
}