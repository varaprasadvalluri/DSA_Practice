package com.ds.linkedList;

public class FindIntersectionPoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList list = new LinkList();

		list.insertAtStart(10);
		Node t2 = list.insertAtLastNode(20);
		Node t3 = list.insertAtLastNode(30);
		Node t4 = list.insertAtLastNode(40);
		Node t5 = list.insertAtLastNode(50);

		LinkList list2 = new LinkList();
		list2.insertAtLast(100);
		list2.insertAtLast(70);
		Node node = list2.insertAtLastNode(80);
		node.next = t4;

		int len1 = 0;
		int len2 = 0;
		Node current1 = list.head;
		while (null != current1) {
			len1++;
			current1 = current1.next;
		}
		Node current2 = list2.head;
		while (null != current2) {
			len2++;
			current2 = current2.next;
		}

		System.out.println(len1 + " " + len2);
		Node head1;
		Node head2;
		int diff = 0;
		if (len1 < len2) {
			head1 = list2.head;
			head2 = list.head;
			diff = len2 - len1;

		} else {
			head1 = list.head;
			head2 = list2.head;
			diff = len1 - len2;
		}

		for (int i = 0; i < diff; i++) {
			head1 = head1.next;
			while (null != head1 && null != head2) {
				if (head1 == head2) {
					System.out.println(head1.data);
					break;
				}
				head1 = head1.next;
				head2 = head2.next;
			}
		}

	}
}
