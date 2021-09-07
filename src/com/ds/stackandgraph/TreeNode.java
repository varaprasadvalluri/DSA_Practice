package com.ds.stackandgraph;

public class TreeNode {
	Node root;

	TreeNode(int key) {
		this.root = new Node(key);
	}

	TreeNode() {
		this.root = null;

	}

	static void preorder(Node node) {
		// print
		if (node != null) {

			preorder(node.left);
			System.out.println("pre order " + node.data);
			preorder(node.right);
		}
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.left.right = new Node(7);
		preorder(tree.root);
		java.util.Stack<Integer> st1 = new java.util.Stack<>();
		java.util.Stack<Integer> st2 = new java.util.Stack<>();
		//
		// if (st1.isEmpty()) {
		// if ((tree.root.left != null) || (tree.root.right != null))
		// st1.push(tree.root.data);
		// }

		System.out.println(tree.root.left.left.data);
	}
}

class Node {

	int data;

	Node left;

	Node right;

	Node(int key) {
		this.data = key;
		this.left = this.right = null;

	}
}