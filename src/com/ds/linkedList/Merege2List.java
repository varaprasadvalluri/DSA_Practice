package com.ds.linkedList;

public class Merege2List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
		list.insertAtLast(10);

		list.insertAtLast(30);

		list.insertAtLast(50);

		LinkList list2 = new LinkList();
		list2.insertAtStart(60);
		list2.insertAtStart(40);
		list2.insertAtStart(40);
		list2.insertAtStart(20);

		// list.printList();

		Node head = mergeList(list, list2);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static Node mergeList(LinkList list1, LinkList list2) {
		Node mergeNode = new Node(0);
		Node curr = mergeNode;

		Node head1 = list1.head;
		Node head2 = list2.head;
		while (null != head1 && null != head2) {
			if (head1.data <= head2.data) {
				curr.next = head1;
				curr = curr.next;
				head1 = head1.next;
			} else {
				curr.next = head2;
				curr = curr.next;
				head2 = head2.next;
			}
		}

		if (null != head1) {
			curr.next = head1;
		} else if (null != head2) {
			curr.next = head2;
		}

		return mergeNode.next;
	}
}
