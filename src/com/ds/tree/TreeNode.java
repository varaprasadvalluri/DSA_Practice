package com.ds.tree;

public class TreeNode {

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	int data;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;

	}

}
