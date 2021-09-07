package com.ds.stackandgraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class SortingTechnics {

	public static void main(String[] args) {
		//
		
		int[] arryList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arry = { 6, 8, 1, 4 };
		for (int index = arryList.length - 1; index >= 0; index--) {
			// index
			for (int i = 0; i < index - 1; i++) {
				int temp = arryList[i];
				arryList[i] = arryList[i + 1];
				arryList[i + 1] = temp;
			}
		}
		System.out.println("ArryList --->" + Arrays.toString(insertionSort(arry)));

		System.out.println("countSubstrings -->" + countSubstrings1("abcab"));
	}

	public static int countSubstrings1(String s) {
		if (s == null || s.isEmpty())
			return 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += extendPalindrom(s, i, i) + extendPalindrom(s, i, i + 1);
		}
		return count;
	}
	// pagination lagic for list

	public static <T> List<List<T>> getPages(Collection<T> c, Integer pageSize) {
		if (c == null)
			return Collections.emptyList();
		List<T> list = new ArrayList<T>(c);
		if (pageSize == null || pageSize <= 0 || pageSize > list.size())
			pageSize = list.size();
		int numPages = (int) Math.ceil((double) list.size() / (double) pageSize);
		List<List<T>> pages = new ArrayList<List<T>>(numPages);
		for (int pageNum = 0; pageNum < numPages;)
			pages.add(list.subList(pageNum * pageSize, Math.min(++pageNum * pageSize, list.size())));
		return pages;
	}

	private static int extendPalindrom(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}

	static int count(String str) {
		if (str.length() == 0)
			return 0;

		int x = 0;
		int count = 0;
		Set<String> set = new HashSet<>();

		while (x < str.length()) {
			for (int k = str.length(); k > x; k--) {
				String st = str.substring(x, k);
				if (set.contains(st))
					count++;
				else {
					if (isPalindrome(st)) {
						count++;
						set.add(st);
					}
				}
			}
			x++;
		}
		return count;
	}

	public static int countSubstrings(String s) {
		if (s.length() == 0)
			return 0;

		int x = 0;
		int count = 0;
		Set<String> set = new HashSet();
		while (x < s.length()) {
			for (int k = s.length(); k > x; k--) {
				String str = s.substring(x, k);
				if (set.contains(str))
					count++;
				else {
					if (isPalindrome(str)) {
						count++;
						set.add(str);
					}
				}

			}
			x++;
		}
		return count;
	}

	private static boolean isPalindrome(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		// check whether the string is palindrome or not
		return s.equals(reverse);
	}

	static int[] insertionSort(int a[]) {
		int i, j, v;
		for (i = 1; i <= a.length - 1; i++) {
			v = a[i];
			j = i;
			while (j >= 1 && a[j - 1] > v) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;
		}
		return a;
	}
}
