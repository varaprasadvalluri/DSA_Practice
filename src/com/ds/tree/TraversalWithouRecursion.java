package com.ds.tree;

import java.util.ArrayList;
import java.util.Stack;

public class TraversalWithouRecursion {
	public ArrayList<Integer> preOrderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		if (null == root) {
			return null;
		} else {
			st.push(root);
			while (!st.isEmpty()) {
				TreeNode temp = st.pop();
				list.add(temp.data);
				if (null != temp.rightChild) {
					st.push(temp.rightChild);
				}
				if (null != temp.leftChild) {
					st.push(temp.leftChild);
				}

			}
			return list;
		}

	}

	public ArrayList<Integer> inOrderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		boolean completed = false;
		TreeNode current = root;
		while (!completed) {
			if (null != current) {
				st.push(current);
				current = current.leftChild;
			} else {
				if (st.isEmpty()) {
					completed = true;
				} else {
					current = st.pop();
					list.add(current.data);
					current = current.rightChild;
				}
			}
		}
		return list;
	}

	public static void preOrder(TreeNode root) {
		if (null == root) {
			return;
		} else {
			Stack<TreeNode> st = new Stack<TreeNode>();
			st.push(root);
			while (!st.isEmpty()) {
				TreeNode temp = st.pop();
				System.out.println(temp.data);
				if (null != temp.rightChild) {
					st.push(temp.rightChild);
				}
				if (null != temp.leftChild) {
					st.push(temp.leftChild);
				}
			}
		}
	}

	public static void INOrderWithoutREC(TreeNode root) {
		if (null == root) {
			return;
		} else {
			Stack<TreeNode> st = new Stack<TreeNode>();
			boolean completed = false;
			TreeNode current = root;
			while (!completed) {
				if (null != current) {
					st.push(current);
					current = current.leftChild;
				} else {
					if (st.isEmpty()) {
						completed = true;
					} else {
						current = st.pop();
						System.out.println(current.data);
						current = current.rightChild;
					}
				}
			}
		}
	}

}
