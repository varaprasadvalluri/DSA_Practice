package com.ds.queue;

import java.util.LinkedList;
import java.util.Queue.*;

public class RottenOrange {

	static int row;
	static int col;

	public static void main(String args[]) {
		int[][] inp2dArray = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 }, };
		row = inp2dArray.length;
		col = inp2dArray[0].length;
		java.util.Queue<element> freshOrangeQueue = formFreshQueue(inp2dArray);
		int minTime = 0;
		minTime = minTimeRotten(inp2dArray, freshOrangeQueue, minTime);
		System.out.println("Minimum time to rot all oranges :" + minTime);

	}

	private static java.util.Queue<element> formFreshQueue(int[][] arr) {

		java.util.Queue<element> elemQueue = new LinkedList<element>();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 1) {
					elemQueue.offer(new element(i, j));
				}
			}
		}
		return elemQueue;

	}

	private static boolean isValid(int i, int j) {
		return (i >= 0 && i < row && j >= 0 && j < col);
	}

	private static int minTimeRotten(int[][] arr, java.util.Queue<element> freshQueue, int minTime) {
		minTime++;

		java.util.Queue<element> toBeRotten = new LinkedList<>();
		java.util.Queue<element> stillFresh = new LinkedList<>();

		element e1 = freshQueue.poll();
		while (null != e1) {
			int i = e1.i;
			int j = e1.j;

			if (isValid(i - 1, j) && arr[i - 1][j] == 2 || isValid(i + 1, j) && arr[i + 1][j] == 2
					|| isValid(i, j - 1) && arr[i][j - 1] == 2 || isValid(i, j + 1) && arr[i][j + 1] == 2) {

				toBeRotten.offer(new element(i, j));

			} else {
				stillFresh.offer(new element(i, j));
			}
			e1 = freshQueue.poll();
		}

		if (stillFresh.isEmpty()) {
			return minTime;
		}
		if (toBeRotten.isEmpty()) {
			return -1;
		} else {
			element e2 = toBeRotten.poll();
			while (null != e2) {
				arr[e2.i][e2.j] = 2;
				e2 = toBeRotten.poll();
			}
		}
		return minTimeRotten(arr, stillFresh, minTime);
	}

}
