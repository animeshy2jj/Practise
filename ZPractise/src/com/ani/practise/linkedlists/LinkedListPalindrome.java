package com.ani.practise.linkedlists;

public class LinkedListPalindrome {

    public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.createSingleLinkedList(1);
	list.insertIntoLinedList(2, 1);
	list.insertIntoLinedList(3, 2);
	list.insertIntoLinedList(2, 3);
	list.insertIntoLinedList(1, 4);

	System.out.println(checkPalindrome(list.getHead()));

    }

    static boolean checkPalindrome(Node head) {
	int size = 1;
	Node tempNode = head;
	while (tempNode.getNext() != null) {
	    tempNode = tempNode.getNext();
	    size++;
	}
	int mid = (size % 2 == 0) ? size / 2 : size / 2 + 1;
	int num = 0;
	tempNode = head;
	for (int i = 1; i <= size; i++) {
	    if (i < mid) {
		num = num * 10 + tempNode.getValue();
	    } else if (i == mid) {
		if (size % 2 == 0) {
		    num = num * 10 + tempNode.getValue();
		}
	    } else {
		if (tempNode.getValue() == num % 10) {
		    num = num / 10;
		} else
		    return false;
	    }
	    tempNode = tempNode.getNext();
	}

	return true;
    }

}
