package com.ds.avltree;

public class AVLTree {
	private AVLTreeNode root;

	/* Constructor */

	public AVLTree() {
		root = null;

	}

	/* Function to check if tree is empty */

	public boolean isEmpty() {
		return root == null;

	}

	/* Make the tree logically empty */

	public void makeEmpty() {
		root = null;

	}

	/* Function to insert data */

	public void insert(int data)

	{

		root = insert(data, root);

	}

	/* Function to get height of node */

	private int height(AVLTreeNode node) {

		return node == null ? 0 : node.height;
	}

	/* Function to max of left/right node */

	private int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;

	}

	/* Function to insert data recursively */

	private AVLTreeNode insert(int x, AVLTreeNode root) {

		if (root == null)

			root = new AVLTreeNode(x);

		else if (x < root.data)

		{

			root.left = insert(x, root.left);

			if (height(root.left) - height(root.right) == 2) {

				if (x < root.left.data)

					root = rightRotation(root);

				else

					root = doubleWithLeftChild(root);
			}

		}

		else if (x > root.data)

		{

			root.right = insert(x, root.right);

			if (height(root.right) - height(root.left) == 2)

				if (x > root.right.data)

					root = leftRotation(root);

				else

					root = doubleWithRightChild(root);

		}

		else

			; // Duplicate; do nothing

		root.height = max(height(root.left), height(root.right)) + 1;

		return root;

	}

	/* Rotate binary tree node with left child */

	private AVLTreeNode rightRotation(AVLTreeNode k2)

	{

		AVLTreeNode k1 = k2.left;

		k2.left = null;

		k1.right = k2;

		k2.height = max(height(k2.left), height(k2.right)) + 1;

		k1.height = max(height(k1.left), k2.height) + 1;

		return k1;

	}

	/* Rotate binary tree node with right child */

	private AVLTreeNode leftRotation(AVLTreeNode k1)

	{

		AVLTreeNode k2 = k1.right;

		k1.right = k2.left;

		k2.left = k1;

		k1.height = max(height(k1.left), height(k1.right)) + 1;

		k2.height = max(height(k2.right), k1.height) + 1;

		return k2;

	}

	/**
	 * 
	 * Double rotate binary tree node: first left child
	 * 
	 * with its right child; then node k3 with new left child
	 */

	private AVLTreeNode doubleWithLeftChild(AVLTreeNode k3)

	{

		k3.left = leftRotation(k3.left);

		return rightRotation(k3);

	}

	/**
	 * 
	 * Double rotate binary tree node: first right child
	 * 
	 * with its left child; then node k1 with new right child
	 */

	private AVLTreeNode doubleWithRightChild(AVLTreeNode k1)

	{

		k1.right = rightRotation(k1.right);

		return leftRotation(k1);

	}

	/* Functions to count number of nodes */

	public int countNodes()

	{

		return countNodes(root);

	}

	private int countNodes(AVLTreeNode r)

	{

		if (r == null)

			return 0;

		else

		{

			int l = 1;

			l += countNodes(r.left);

			l += countNodes(r.right);

			return l;

		}

	}

	/* Functions to search for an element */

	public boolean search(int val)

	{

		return search(root, val);

	}

	private boolean search(AVLTreeNode r, int val)

	{

		boolean found = false;

		while ((r != null) && !found)

		{

			int rval = r.data;

			if (val < rval)

				r = r.left;

			else if (val > rval)

				r = r.right;

			else

			{

				found = true;

				break;

			}

			found = search(r, val);

		}

		return found;

	}

	/* Function for inorder traversal */

	public void inorder()

	{

		inorder(root);

	}

	private void inorder(AVLTreeNode r)

	{

		if (r != null)

		{

			inorder(r.left);

			System.out.print(r.data + " ");

			inorder(r.right);

		}

	}

	/* Function for preorder traversal */

	public void preorder()

	{

		preorder(root);

	}

	private void preorder(AVLTreeNode r)

	{

		if (r != null)

		{

			System.out.print(r.data + " ");

			preorder(r.left);

			preorder(r.right);

		}

	}

	/* Function for postorder traversal */

	public void postorder()

	{

		postorder(root);

	}

	private void postorder(AVLTreeNode r)

	{

		if (r != null)

		{

			postorder(r.left);

			postorder(r.right);

			System.out.print(r.data + " ");

		}

	}

}
