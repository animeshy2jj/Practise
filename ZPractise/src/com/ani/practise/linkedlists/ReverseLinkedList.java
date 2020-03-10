package com.ani.practise.linkedlists;

public class ReverseLinkedList {

    public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.createSingleLinkedList(1);
	list.insertIntoLinedList(2, 1);
	list.insertIntoLinedList(3, 2);
	Node head = reverseLinkedList(list.getHead(), null);
	list.print(head);
    }

    public static Node reverseLinkedList(Node curr, Node prev) {

	if (curr.getNext() == null) {
	    prev.setNext(null);
	    curr.setNext(prev);
	    return curr;
	}

	Node temp = reverseLinkedList(curr.getNext(), curr);
	if (prev != null) {
	    prev.setNext(null);
	    curr.setNext(prev);
	}

	return temp;
    }

}
