package com.ds.avltree;

public class CheckIsAVL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isAVL(AVLTreeNode root) {
		if (null == root) {
			return true;
		}

		return isAVL(root.left) && isAVL(root.right) && (Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1);
	}

	private int getHeight(AVLTreeNode root) {
		// TODO Auto-generated method stub
		int leftHeight, rightHeight;
		if (null == root) {
			return 0;
		}
		leftHeight = getHeight(root.left);
		rightHeight = getHeight(root.right);
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}
}
