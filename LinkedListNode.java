package com.dsapractice;

import java.util.HashSet;
import java.util.Stack;

public class LinkedListNode {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static void insertNodeAtLast(LinkedListNode nodeList, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (nodeList.head == null) {
            nodeList.head = newNode;
        } else {
            Node lastNode = nodeList.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    static void printLinkedList(LinkedListNode listNode) {
        Node currentNode = listNode.head;
        while (currentNode != null) {
            System.out.println("Node data -->" + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    //Written by me
    static LinkedListNode searchNodeData(LinkedListNode listNode, int dataSearcKey) {
        Node currentNode = listNode.head;
        boolean isElementFound = false;
        while (currentNode != null) {
            if (currentNode.data == dataSearcKey) {
                System.out.println("found --->" + currentNode.data);
                isElementFound = true;
            }
            currentNode = currentNode.next;
        }
        if (isElementFound == Boolean.FALSE) {
            System.out.println("Not Found!");
        }
        return listNode;
    }

    static LinkedListNode DeleteNode(LinkedListNode listNode) {
        return listNode;
    }

    static int getLength(LinkedListNode listNode) {
        int size = 0;
        Node currentNode = listNode.head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    static int getRecCount(LinkedListNode listNode) {
        return countReccer(listNode.head);
    }

    static int countReccer(Node node) {
        if (node == null) return 0;
        return 1 + countReccer(node.next);
    }

    static int GetNthNode(LinkedListNode listNode, int index) {
        Node currentNode = listNode.head;
        int count = 0;
        while (currentNode != null) {
            if (count == index) return currentNode.data;
            currentNode = currentNode.next;
            count++;
        }
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return 0;
    }

    //Algo's -->
    /*
    steps -->1 -> Create new Node with new Element
    2 -> make head pointer as new node and move head pointer to next of new node
     */
    static void insertNodeAtFirst(LinkedListNode listNode, int data) {
        Node newNode = new Node(data);//creating new Node
        newNode.next = listNode.head;
        listNode.head = newNode;
    }

    //Reverse a Node
    public static Node reverse(Node head) {
        Node curr = null;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = curr;
            curr = temp;
            temp = curr.next;
            curr.next = prev;
        }
        return curr;
    }

    /*
    steps using hashSet
     */
    static boolean detectLoop(LinkedListNode listNode) {
        Node headNode = listNode.head;
        HashSet<Node> set = new HashSet<>();
        while (headNode != null) {
            if (set.contains(headNode)) {
                return true;
            }
        }
        set.add(headNode);
        headNode = headNode.next;
        return false;
    }

    //Floyd’s Cycle-Finding Algorithm
    //Move one pointer(slow_p) by one and another pointer(fast_p) by two.
    //If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop.
    static boolean loopDetectWithFloydAlgo(LinkedListNode listNode) {
        Node slow_p = listNode.head, fast_p = listNode.head;
        while (fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    static void findMiddleElement(LinkedListNode listNode) {
        Node slow_p = listNode.head;
        Node fast_p = listNode.head;
        while (fast_p != null && fast_p.next != null && fast_p.next.next != null) {//even 10
            fast_p = fast_p.next.next;
            slow_p = slow_p.next;
        }
        //Even or odd
        if (fast_p.next == null) System.out.println("Odd");
        else System.out.println("EVEN");

        if (fast_p.next == null) System.out.println("Element found -->" + slow_p.data);
        else System.out.println("Element found -->" + slow_p.data + "," + slow_p.next.data);

//        System.out.println("Element found -->" + slow_p.data + " Next -->" + ( ? slow_p.next.data : ""));
    }

    //La
    static boolean isLinkedListPolindrome(Node headNode) {
        Node slow_p = headNode;
        Stack<Integer> stack = new Stack<>();
        boolean isPlidm = Boolean.FALSE;
        while (slow_p != null) {
            stack.push(slow_p.data);//1 ->2 -> 3 ->4
            slow_p = slow_p.next;
        }
        while (headNode != null) {
            if (stack.pop() != headNode.data)
                return Boolean.FALSE;
            headNode = headNode.next;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        LinkedListNode listNode = new LinkedListNode();
        insertNodeAtLast(listNode, 1);
        insertNodeAtLast(listNode, 2);
        insertNodeAtLast(listNode, 3);
        insertNodeAtLast(listNode, 4);
        insertNodeAtLast(listNode, 5);
        insertNodeAtLast(listNode, 6);
        //listNode.head.next.next.next.next.next = listNode.head.next.next;
        //insertNodeAtLast(listNode, 6);
        //insertNodeAtLast(listNode, 7);
        // printLinkedList(listNode);
        //searchNodeData(listNode, 10);
        // System.out.println("Size -->" + getLength(listNode));
        // System.out.println("RecCount -->" + getRecCount(listNode));
        // System.out.println("Element at index 2 is --->" + GetNthNode(listNode, 2));
        //insertNodeAtFirst(listNode, 100);
        //  printLinkedList(listNode);

        //if (detectLoop(listNode)) {
        //  System.out.println("Loop found");
        //} else {
        //  System.out.println("No Loop");
        //}
        printLinkedList(listNode);
        findMiddleElement(listNode);
        //listNode.head.next.next.next.next = listNode.head.next.next;
        // System.out.println("data --->" + listNode.head.next.next.next.next.data);
//        boolean isLoopDetect = loopDetectWithFloydAlgo(listNode);
//        System.out.println("isLoopDetected -->" + isLoopDetect);
        boolean isPlodm = isLinkedListPolindrome(listNode.head);
        System.out.println("isPlindrom -->" + isPlodm);
    }
}

