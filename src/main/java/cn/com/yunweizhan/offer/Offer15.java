package cn.com.yunweizhan.offer;

public class Offer15 {
	public int hammingWeight(int n) {
		int res = 0;
		while (n != 0) {
			if ((n & 1) != 0)
				res++;
			n = n >>> 1;
		}
		return res;
	}

	public static void main(String[] args) {
		Offer15 offer15 = new Offer15();
		System.out.println(offer15.hammingWeight(11));
		System.out.println(offer15.hammingWeight(128));
		System.out.println(offer15.hammingWeight(-3));
	}
}
