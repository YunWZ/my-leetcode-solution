package cn.com.yunweizhan.hard;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>文本左右对齐</p>
 * <p>
 * 给定一个单词数组words 和一个长度maxWidth，重新排版单词，使其成为每行恰好有maxWidth个字符，且左右两端对齐的文本。<br/>
 *
 * 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格' '填充，使得每行恰好有 maxWidth个字符。<br/>
 *
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。<br/>
 *
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。<br/>
 *
 * 注意:<br/>
 *
 * 单词是指由非空格字符组成的字符序列。<br/>
 * 每个单词的长度大于 0，小于等于maxWidth。<br/>
 * 输入单词数组 words至少包含一个单词。<br/>
 *
 * </p>
 * @author Weizhan▪Yun
 * @date 2022/5/3 12:13
 */
public class Solution68 {
	public List<String> fullJustify(String[] words, int maxWidth) {

		List<String> result = new LinkedList<>();

		int wordCountPerLine = 0;
		int beginPerLine = 0;
		for (int i = 0; i < words.length; i++) {
			wordCountPerLine += words[i].length() + 1;
			//最后一行或者单次溢出,则需要进行处理
			if (i == words.length - 1 || wordCountPerLine + words[i + 1].length() > maxWidth) {
				result.add(lindWrap(words, beginPerLine, i, wordCountPerLine, i == words.length - 1, maxWidth));
				//reset
				wordCountPerLine = 0;
				//下一行的开始单次
				beginPerLine = i + 1;
			}
		}

		return result;
	}

	/**
	 * 行填充
	 * 对当前行进行空格填充
	 *
	 * @param words 整体文本
	 * @param beginPerLine 当前行的第一个单词开始位置
	 * @param endPerLine 当前行的第一个单词结束位置
	 * @param charLength 当前行的基本长度(每个单词的`长度+词尾空格`)
	 * @param isLastedLine 是否为最后一行
	 * @param maxWidth 每行的最大宽度
	 * @return 已进行包装的当前行
	 */
	private String lindWrap(String[] words, int beginPerLine, int endPerLine, int charLength, boolean isLastedLine, int maxWidth) {
		StringBuilder stringBuilder = new StringBuilder();
		if (beginPerLine == endPerLine) {
			stringBuilder.append(words[beginPerLine]);
			for (int i = 0; i < maxWidth - words[beginPerLine].length(); i++) {
				stringBuilder.append(" ");
			}
			return stringBuilder.toString();
		}

		int spaceCount = maxWidth - charLength + 1, wordCount = endPerLine - beginPerLine + 1;
		int svg = spaceCount / (wordCount - 1), pre = spaceCount % (wordCount - 1), p = 0;
		for (int i = 0; i < (endPerLine - beginPerLine); i++) {
			stringBuilder.append(words[beginPerLine + i]).append(" ");
			if (isLastedLine) {
				continue;
			}

			for (int j = 0; j < svg; j++) {
				stringBuilder.append(" ");
			}

			if (p < pre) {
				stringBuilder.append(" ");
				p++;
			}
		}

		stringBuilder.append(words[endPerLine]);
		if (stringBuilder.length() < maxWidth) {
			for (int i = stringBuilder.length(); i < maxWidth; i++) {
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();
	}
}
