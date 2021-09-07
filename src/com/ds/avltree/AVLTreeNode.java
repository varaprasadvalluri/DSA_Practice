package com.ds.avltree;

public class AVLTreeNode {
	AVLTreeNode left, right;
	int data;
	int height;

	public AVLTreeNode() {
		left = null;
		right = null;
		data = 0;
		height = 0;
	}

	/* Constructor */
	public AVLTreeNode(int n) {
		left = null;
		right = null;
		data = n;
		height = 0;
	}

	public AVLTreeNode getLeft() {
		return left;
	}

	public void setLeft(AVLTreeNode left) {
		this.left = left;
	}

	public AVLTreeNode getRight() {
		return right;
	}

	public void setRight(AVLTreeNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
