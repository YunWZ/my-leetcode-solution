package cn.com.yunweizhan.offer;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/5 14:53
 */
public class Offer05 {
	public String replaceSpace(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (' ' == s.charAt(i)) {
				stringBuilder.append("%20");
			}
			else {
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}

	public String replaceSpace2(String s) {
		return s.replaceAll(" ","%20");
	}
}
