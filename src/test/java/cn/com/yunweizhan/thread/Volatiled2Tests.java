package cn.com.yunweizhan.thread;

import cn.com.yunweizhan.BaseTests;
import cn.com.yunweizhan.common.entity.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/12 15:13
 */
class Volatiled2Tests extends BaseTests {

	private Volatiled2 instance = new Volatiled2();

	@Test
	void lirun() {
		test(new int[] {1, 4, 2, 3});
	}

	public void test(int[] prices) {
		assertEquals(instance.lirun(prices), 4);
	}

	@Test
	public void printTreeByBfs() {
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node1 = new Node(1, node3, null);
		Node node2 = new Node(2, null, node4);
		Node node0 = new Node(0, node1, node2);


		System.out.println(instance.printTreeByBfs(node0));
	}
}