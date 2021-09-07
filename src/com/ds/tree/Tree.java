package com.ds.tree;

public class Tree {

	TreeNode root;

	public Tree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}

	/**
	 * @param data
	 *            insert data in Tree
	 */
	public void insert(int data) {
		TreeNode node = new TreeNode(data);
		if (null == root) {
			root = node;
		} else {
			TreeNode current = root;
			TreeNode parent;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.leftChild;
					if (null == current) {
						parent.leftChild = node;
						return;
					}
				} else {
					current = current.rightChild;
					if (null == current) {
						parent.rightChild = node;
						return;
					}
				}
			}
		}
	}

	/**
	 * @param data
	 * @return Find data in Tree
	 */
	public TreeNode findData(int data) {
		TreeNode current = root;
		while (current.data != data) {
			if (data < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		return current;
	}

	/**
	 * @param data
	 *            Insert data in Tree with recusrion
	 */
	public void insertRecursion(int data) {

		root = insertRecur(root, data);

		System.out.println(root.data);
	}

	/**
	 * @param root
	 * @param data
	 * @return
	 */
	public TreeNode insertRecur(TreeNode root, int data) {
		if (null == root) {
			root = new TreeNode(data);
		} else {
			if (data <= root.data) {
				root.setLeftChild(insertRecur(root.leftChild, data));
			} else {
				root.setRightChild(insertRecur(root.rightChild, data));
			}
		}

		return root;
	}

	/**
	 * @param root
	 *            Pre Order Traversal
	 */
	public void preOrder(TreeNode root) {
		if (null != root) {
			System.out.println(root.data);
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}

	}

	/**
	 * @param root
	 *            In order Traversal
	 */
	public void inOrder(TreeNode root) {
		if (null != root) {
			inOrder(root.leftChild);
			System.out.println(root.data);
			inOrder(root.rightChild);
		}

	}

	/**
	 * @param root
	 *            Post order Traversal
	 */
	public void postOrder(TreeNode root) {
		if (null != root) {
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.println(root.data);
		}

	}

	/**
	 * @param root
	 * @return Count Tree Nodes
	 */
	public int couuntNodes(TreeNode root) {
		if (null == root) {
			return 0;
		} else {
			int count = 1;
			count = count + couuntNodes(root.leftChild);
			count = count + couuntNodes(root.rightChild);
			return count;
		}
	}

	public int getLeafNodeCount(TreeNode root) {
		if (null == root) {
			return 0;
		}
		if (root.leftChild == null && root.rightChild == null) {
			return 1;
		}
		return getLeafNodeCount(root.leftChild) + getLeafNodeCount(root.rightChild);
	}

}
