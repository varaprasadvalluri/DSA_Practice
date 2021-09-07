package com.ds.tree;

public class IsIdentical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(2);
		tree.root.leftChild = new TreeNode(3);

		Tree tree2 = new Tree();
		tree2.root = new TreeNode(1);
		tree2.root.rightChild = new TreeNode(2);
		// tree2.root.leftChild = new TreeNode(3);

		System.out.println(isIdentical(tree.root, tree2.root));

	}

	public static boolean isIdentical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		} else {
			if (root1.data == root2.data) {
				return isIdentical(root1.rightChild, root2.rightChild) && isIdentical(root1.leftChild, root2.leftChild);
			}
		}
		return false;
	}

}
