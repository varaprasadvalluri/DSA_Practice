package com.ds.tree;

public class MirrorImageOfTree {

	static boolean isMirror(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if ((node1 == null || node2 == null)) {
			return false;
		}
		if (node1.data == node2.data) {
			return (isMirror(node1.getLeftChild(), node2.getRightChild())
					&& isMirror(node1.getRightChild(), node2.getLeftChild()));
		}
		return false;

	}

	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(1);
		root1.leftChild = new TreeNode(2);
		root1.rightChild = new TreeNode(3);
		root1.leftChild.leftChild = new TreeNode(4);
		root1.leftChild.rightChild = new TreeNode(5);

		root2.leftChild = new TreeNode(3);
		root2.rightChild = new TreeNode(2);
		root2.rightChild.leftChild = new TreeNode(5);
		root2.rightChild.rightChild = new TreeNode(4);

		System.out.println(isMirror(root1, root2));

	}

}
