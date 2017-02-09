package main.java.com.evansitzes.hackerrank.datastructures.linkedlists;

/**
 Reverse a linked list and return pointer to the head
 The input list will have at least one element
 */

public class ReverseLinkedList {

    class Node {
        int data;
        Node next;
    }

    public Node reverse(final Node head) {
        final Node newHead;

        if (head == null || head.next == null) {
            return head;
        }

        newHead = reverse(head.next);
        head.next.next = head; // set next node to this
        head.next = null; // cancel out this (so that new last node points to nothing)

        return newHead;
    }
}
