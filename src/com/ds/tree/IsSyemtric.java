package com.ds.tree;

public class IsSyemtric {
	static boolean isMirror(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if ((node1 == null || node2 == null)) {
			return false;
		}
		// 1 - Their root node's key must be same
		// 2 - leftChild subtree of left tree and rightChild subtree
		// of right tree have to be mirror images
		// 3 - right subtree of left tree and left subtree
		// of right tree have to be mirror images
		if (node1.data == node2.data) {
			return (isMirror(node1.getLeftChild(), node2.getRightChild())
					&& isMirror(node1.getRightChild(), node2.getLeftChild()));
		}
		return false;

	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.leftChild = new TreeNode(2);
		root.rightChild = new TreeNode(2);
		root.leftChild.leftChild = new TreeNode(3);
		root.leftChild.rightChild = new TreeNode(4);
		root.rightChild.leftChild = new TreeNode(4);
		root.rightChild.rightChild = new TreeNode(3);

		System.out.println(isMirror(root, root));

	}

}
