package com.ds.linkedList;

public class GetKElementFromLast {
	public static void main(String args[]) {
		LinkList list = new LinkList();
		// list.insertAtStart(50);
		list.insertAtStart(6);
		list.insertAtStart(5);
		list.insertAtStart(3);
		list.insertAtStart(1);

		System.out.println(findElement(0, list));
	}

	private static int findElement(int k, LinkList list) {

		int len = 0;
		Node current = list.head;
		while (current != null) {
			len++;
			current = current.next;
		}
		Node current2 = list.head;
		int diff = len - k;
		for (int i = 1; i < diff; i++) {
			current2 = current2.next;

		}
		return current2.data;

	}
}
