package com.ds.queue;

import java.util.LinkedList;

public class RotenOrange {
	public static void main(String args[]) {

		java.util.Queue<element> freshOrangeQ;
		int[][] inp2dArray = { { 2, 1, 0, 2, 1 }, { 1, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 }, };

		int minTime = 0;
		freshOrangeQ = formFreshQueue(inp2dArray);
		minTime = minimumTimeToRotAllOranges(inp2dArray, freshOrangeQ, minTime);
		System.out.println("Minimum time to rot all oranges :" + minTime);

	}

	private static java.util.Queue<element> formFreshQueue(int[][] inp2dArray) {
		java.util.Queue<element> elemQueue = new LinkedList<element>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (inp2dArray[i][j] == 1) {
					elemQueue.offer(new element(i, j));
				}
			}
		}
		return elemQueue;
	}

	private static boolean isValid(int i, int j) {
		return (i >= 0 && i < 3 && j >= 0 && j < 5);
	}

	private static int minimumTimeToRotAllOranges(int[][] inp2dArray, java.util.Queue<element> formFreshQueue,
			int minTime) {
		minTime++;
		java.util.Queue<element> toBeRotten = new LinkedList<element>();
		java.util.Queue<element> stillFresh = new LinkedList<element>();

		element el = formFreshQueue.poll();

		while (null != el) {

			int i = el.i;
			int j = el.j;

			if (isValid(i - 1, j) && inp2dArray[i - 1][j] == 2 || isValid(i + 1, j) && inp2dArray[i + 1][j] == 2
					|| isValid(i, j - 1) && inp2dArray[i][j - 1] == 2
					|| isValid(i, j + 1) && inp2dArray[i][j + 1] == 2) {

				toBeRotten.add(el);
			} else {

				stillFresh.add(el);
			}
			el = formFreshQueue.poll();
		}

		if (stillFresh.isEmpty()) {
			return minTime;
		}

		if (toBeRotten.isEmpty()) {
			return -1;
		} else {
			element e2 = toBeRotten.poll();
			while (null != e2) {
				inp2dArray[e2.i][e2.j] = 2;
				e2 = toBeRotten.poll();
			}
		}

		return minimumTimeToRotAllOranges(inp2dArray, stillFresh, minTime);
	}
}
