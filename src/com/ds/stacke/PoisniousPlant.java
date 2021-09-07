package com.ds.stacke;

import java.util.ArrayList;

public class PoisniousPlant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 10, 7, 3, 5, 6, 6 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		getdays(list);
		System.out.println(simulateDays(arr));
	}

	static int simulateDays(final int[] plants) {
		if (plants.length <= 1)
			return 0;
		int plantSize = plants.length;
		int days = 0;
		int i;
		int lastDying = 1;
		while (true) { // simulate as many days as needed
			// Search for first plant to die today
			for (i = lastDying; i < plantSize; ++i) {
				if (plants[i - 1] < plants[i])
					break;
			}
			if (i == plantSize)
				return days; // no plant found to be dying
			lastDying = i; // optimize the initial search next day
			int removed = 1; // the one found (plants[i]) will die
			// Now search remaining plants for any other dying today and also
			// remove all of them
			for (++i; i < plantSize; ++i) {
				if (plants[i - 1] < plants[i]) { // plant[i] dies, count+skip
													// it.
					++removed;
				} else { // plant[i] survives, move it to last living one
					plants[i - removed] = plants[i];
				}
			}
			plantSize -= removed; // adjust total number of remaining plants
			++days; // let's see another day
		}
	}

	private static void getdays(ArrayList<Integer> list) {

		int days = 0;
		while (true) {

			ArrayList<Integer> toBeRemoved = new ArrayList<Integer>();
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) < list.get(i + 1)) {
					toBeRemoved.add((i + 1));
				}

			}
			if (toBeRemoved.size() == 0) {
				System.out.println(days);
				break;
			} else {
				days++;
			}
			/*
			 * Iterator<Integer> itr = list.iterator(); while(itr.hasNext()){ int temp =
			 * itr.next(); if(toBeRemoved.contains(temp)){ itr.remove();
			 * toBeRemoved.remove(toBeRemoved.indexOf(temp)); } }
			 */
			for (int i : toBeRemoved) {
				if (i == list.size())
					i = i - 1;
				// list.re
			}
			// list.removeAll(toBeRemoved);

		}

	}
}
