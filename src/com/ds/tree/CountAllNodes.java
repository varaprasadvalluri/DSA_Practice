package com.ds.tree;

public class CountAllNodes {
	public static int countNodes(TreeNode root) {
		if (null == root) {
			return 0;
		} else {
			return (1 + countNodes(root.leftChild) + countNodes(root.rightChild));

		}
	}

	public static void main(String args[]) {
		Tree tree = new Tree();
		tree.insert(50);
		tree.insert(40);
		tree.insert(70);
		System.out.println(countNodes(tree.root));
	}
}
