
public class ListNode {
  Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
  static void insertNodeAtLast(ListNode nodeList, int data) {
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

public ListNode reverseList(ListNode head) {
    ListNode curr = null;
    ListNode temp = head;
    ListNode prev = null;
    while(temp != null){
        prev = curr;
        curr = temp;
        temp = curr.next;
        curr.next = prev;
    }
    return curr; 
}
  public static void main(String[] str){
    ListNode listNode = new ListNode();
        insertNodeAtLast(listNode, 1);
        insertNodeAtLast(listNode, 2);
        insertNodeAtLast(listNode, 3);
        insertNodeAtLast(listNode, 4);
        insertNodeAtLast(listNode, 5);
        insertNodeAtLast(listNode, 6);
        reverseList(listNode);
  }
}
