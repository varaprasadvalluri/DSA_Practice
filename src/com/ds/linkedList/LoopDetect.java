package com.ds.linkedList;

public class LoopDetect {
	public static void main(String args[]) {
		LinkList list = new LinkList();

		list.insertAtStart(10);
		Node t2 = list.insertAtLastNode(20);
		Node t3 = list.insertAtLastNode(30);
		Node t4 = list.insertAtLastNode(40);
		Node t5 = list.insertAtLastNode(50);
		t5.next = t3;

		System.out.println(detectLoop(list));

	}

	public static boolean detectLoop(LinkList list) {
		boolean loop = false;
		Node slow = list.head;
		Node fast = list.head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				loop = true;
				break;
			}

		}
		return loop;
	}
}
