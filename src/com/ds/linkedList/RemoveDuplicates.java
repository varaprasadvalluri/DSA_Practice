package com.ds.linkedList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
		list.insertAtStart(5);
		list.insertAtLast(1);
		list.insertAtLast(3);
		list.insertAtLast(2);
		list.insertAtLast(7);
		list.insertAtLast(10);
		String s = new String();

		// Node head= RemoveDuplicates(list.head);
		Node head = removeOdds(list.head);
		System.err.println(head.data);
	}

	static Node RemoveDuplicates(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node current = head;
		while (current.next != null) {
			if (current.data != current.next.data) {
				current.next = current.next;
			} else {
				current.next = current.next.next;
			}
		}
		return head;
	}

	static Node removeOdds(Node head) {
		Node current = head;
		Node prev = null;
		while (current.data % 2 != 0) {
			current = current.next;
		}
		head = current;
		prev = current;
		while (current != null) {
			if (current.data % 2 == 0) {
				prev = current;
			} else {
				prev.next = current.next;
			}
			current = current.next;
		}
		return head;

	}
}
