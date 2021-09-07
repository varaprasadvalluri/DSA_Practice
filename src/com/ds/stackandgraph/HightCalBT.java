package com.ds.stackandgraph;

import java.util.LinkedList;
import java.util.Queue;

public class HightCalBT {

	static int calculateRoottoLeafNodeHight(Node root) {
		int hight = 0;
		if (root == null)
			return hight;
		int leftHight = 1 + calculateRoottoLeafNodeHight(root.left);
		int rightHight = 1 + calculateRoottoLeafNodeHight(root.right);
		if (leftHight > rightHight)
			hight = leftHight;
		else
			hight = rightHight;
		return hight;
	}

	static int daimeterOfNode(Node root) {
		int daiHight = 0;
		return daiHight;
	}

	int n = 5;
	
	public int fibN(int n) {
		int[] fib = new int[n + 1];
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (fib[n] != 0)
			return fibN(n);
		return fib[n] = fibN(n - 1) + fibN(n - 2);
	}

	public static void main(String[] args) {
		Queue<String> st1 = new LinkedList<>();
		HightCalBT bT = new HightCalBT();
		// fib

		System.out.println(bT.fibN(5));
		st1.offer("vara");
		st1.offer("vara1");

		while (!st1.isEmpty()) {
			System.out.println(st1.peek());
			st1.poll();
		}

		TreeNode bt = new TreeNode();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.right.right = new Node(5);
		bt.root.left.left.left = new Node(6);
		System.out.println(calculateRoottoLeafNodeHight(bt.root));
	}

}
