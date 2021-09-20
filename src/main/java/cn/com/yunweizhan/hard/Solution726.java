package cn.com.yunweizhan.hard;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution726 {
	private Stack<String> subFormula = new Stack<>();
	private Map<Character, Integer> countOfAtoms = new TreeMap<>();

	public String countOfAtoms(String formula) {
		countOfAtoms(formula,1);
		return countOfAtoms.toString();
	}

	private void countOfAtoms(String formula, int i) {

	}

	public static void main(String[] args) {

	}
}
