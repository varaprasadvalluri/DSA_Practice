//package com.ds.linkedList;
//
//public class SLinkedList {
//
//	private Node head;
//
//	/***
//	 * Traverse the LinkedList
//	 */
//	public void travarseList(Node listNode) {
//		this.head = listNode;
//		int index = 0;
//		while (this.head != null) {
//			System.out.println("data -->" + this.head.getData());
//			this.head = listNode.getNode();
//			index++;
//		}
//
//	}
//
//	public void insertNodeAtBegining(Node node, int data) {
//		if (this.head == null)
//			this.head = new Node(data);
//	}
//
//	public void insertNodeAtEnding(Node node, int data) {
//		Node p, q;
//		for (p = this.head; (q = p.getNext()) != null; p = q) {
//			p.setNext(node);
//		}
//	}
//
//	public static void main(String[] args) {
//		SLinkedList list = new SLinkedList();
//		Node node = new Node(0);
//		list.head = node;
//	}
//
//}
