package com.ds.linkedList;

public class ReverseLinkList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();

		list.insertAtStart(10);
		Node t2 = list.insertAtLastNode(20);
		Node t3 = list.insertAtLastNode(30);
		Node t4 = list.insertAtLastNode(40);
		Node t5 = list.insertAtLastNode(50);

		Node head = reverseList2(list);

		while (null != head) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node reverseList(LinkList list) {
		Node current = list.head;
		Node prev = null;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static Node reverseList2(LinkList list) {
		Node current = list.head;
		Node prev = null;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
