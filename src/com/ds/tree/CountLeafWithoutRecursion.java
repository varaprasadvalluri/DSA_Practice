package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeafWithoutRecursion {
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

	public static int countLeaf(TreeNode root) {
		int count = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.rightChild == null && node.leftChild == null) {
				count++;
			} else {
				if (null != node.leftChild) {
					queue.offer(node.leftChild);
				}
				if (null != node.rightChild) {
					queue.offer(node.rightChild);
				}
			}

		}
		System.out.println(count);
		return count;

	}
}
