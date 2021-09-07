package com.ds.tree;

public class CountHalfLeafNode {
	public static int counthalfLeaf(TreeNode root) {
		if (null == root) {
			return 0;
		}
		int res = 0;
		if ((root.leftChild == null && root.rightChild != null)
				|| (root.leftChild != null && root.rightChild == null)) {
			res++;
		}
		res = res + counthalfLeaf(root.leftChild) + counthalfLeaf(root.rightChild);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.leftChild = new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		tree.root.rightChild.leftChild = new TreeNode(30);
		tree.root.rightChild.leftChild.rightChild = new TreeNode(55);
		tree.root.leftChild.leftChild = new TreeNode(4);

		// tree.root.leftChild.rightChild = new TreeNode(5);
		System.out.println(counthalfLeaf(tree.root));

	}

}
