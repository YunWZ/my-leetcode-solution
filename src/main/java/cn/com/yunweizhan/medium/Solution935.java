package cn.com.yunweizhan.medium;

/**
 * 骑士拨号器
 */
public class Solution935 {
	/**
	 *
	 * f(A,n)=f(B,n-1)+f(C,n-1)
	 * f(B,n)=2*f(A,n-1)
	 * f(C,n)=2*f(A,n-1)+f(D,n-1)
	 * f(D,n)=2*f(C,n-1)
	 *
	 * @param n
	 * @return
	 */
	private static final int mod = 1000000007;

	public int knightDialer(int n) {
		int[] nums = {1, 1, 1, 1};
		if (n == 1) {
			return 10;
		}

		for (int i = 0; i < n - 1; i++) {
			int a = (nums[1] + nums[2]) % mod, b = 2 * nums[0] % mod, c = (2 * nums[0] + nums[3]) % mod, d = 2 * nums[2] % mod;
			nums[0] = a;
			nums[1] = b;
			nums[2] = c;
			nums[3] = d;
		}
		return (int) ((4 * nums[0]%mod + 2 * nums[1]%mod + 2 * nums[2]%mod + nums[3]%mod) % 1000000007L);
//		return (4 * nums[0] + 2 * nums[1] + 2 * nums[2] + nums[3]) % 1000000007;
	}
}
