package com.ds.linkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList list = new LinkList();
		list.insertAtStart(10);
		list.insertAtStart(20);
		list.insertAtStart(30);
		list.insertAtStart(40);
		list.insertAtLast(50);
		list.insertAfter(20, 25);
		list.printList();
	}
}
