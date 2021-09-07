package com.ds.linkedList;

public class DoblyLinkedList {
	DoublyNode head;

	public DoblyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}

	public void insertAtBegining(int data) {
		DoublyNode node = new DoublyNode(data);
		if (null == head) {
			head = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}

	public void insertAtLast(int data) {
		DoublyNode node = new DoublyNode(data);
		if (null == head) {
			head = node;
		} else {
			DoublyNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.prev = current;
		}
	}

	public void deleteFromStart() {
		if (null == head) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}
	}

	public void deleteFromLast() {
		if (null == head) {
			System.out.println("List is Empty");
		} else {
			DoublyNode current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void printForward() {
		DoublyNode currentNode = head;
		while (null != currentNode) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void printBackword() {
		DoublyNode currentNode = head;
		while (null != currentNode.next) {
			currentNode = currentNode.next;
		}
		while (null != currentNode) {
			System.out.println(currentNode.data);
			currentNode = currentNode.prev;
		}
	}
}
