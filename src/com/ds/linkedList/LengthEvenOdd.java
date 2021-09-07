package com.ds.linkedList;

public class LengthEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList list = new LinkList();
		list.insertAtStart(5);
		list.insertAtStart(4);
		list.insertAtStart(3);
		list.insertAtStart(2);
		list.insertAtStart(1);
		Node current = list.head;

		while (current != null && current.next != null) {
			current = current.next.next;
		}
		if (null == current) {
			System.out.println("Even list");
		} else {
			System.out.println("Odd List ");
		}

	}
}
