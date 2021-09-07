package com.ds.tree;

public class CountLeafNode {
	public static int countLeaf(TreeNode root) {
		if (null == root) {
			return 0;
		}
		if (root.leftChild == null && root.rightChild == null) {
			return 1;
		}
		return countLeaf(root.leftChild) + countLeaf(root.rightChild);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.leftChild = new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		tree.root.leftChild.leftChild = new TreeNode(4);
		tree.root.leftChild.rightChild = new TreeNode(5);
		System.out.println(countLeaf(tree.root));

	}

}
