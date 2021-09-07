package com.ds.linkedList;

public class LinkList {

	Node head;

	public LinkList() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	public void insertAtStart(int data) {
		Node temp = new Node(data);
		if (null == head) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	public void insertAtLast(int data) {
		Node temp = new Node(data);
		Node current = head;
		if (null == current) {
			head = temp;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}

	}

	public Node insertAtLastNode(int data) {
		Node temp = new Node(data);
		Node current = head;
		if (null == current) {
			head = temp;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
		return temp;

	}

	public void insertAfter(int data, int data2) {
		Node current = head;

		Node temp = new Node(data2);

		while (current.data != data) {
			current = current.next;
		}

		Node temp2 = current.next;
		current.next = temp;
		temp.next = temp2;
	}

	public void deleteFromFirst(LinkList list) {
		if (null == head) {
			System.out.println("List is empty");
		} else {
			head = head.next;
		}

	}

	public void printList() {
		Node currentNode = head;
		while (null != currentNode) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

}
