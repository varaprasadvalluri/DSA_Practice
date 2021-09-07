package com.ds.tree;

import java.util.Stack;

public class SpiralTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.leftChild = new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		tree.root.leftChild.leftChild = new TreeNode(4);
		tree.root.leftChild.rightChild = new TreeNode(5);
		SpiralTreversal(tree.root);

	}

	public static void SpiralTreversal(TreeNode root) {
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				TreeNode node = s1.pop();
				System.out.println(node.data);
				if (null != node.leftChild) {
					s2.push(node.leftChild);
				}
				if (null != node.rightChild) {
					s2.push(node.rightChild);
				}
			}
			while (!s2.isEmpty()) {
				TreeNode node = s2.pop();
				System.out.println(node.data);
				if (null != node.rightChild) {
					s1.push(node.rightChild);
				}
				if (null != node.leftChild) {
					s1.push(node.leftChild);
				}
			}
		}
	}

}