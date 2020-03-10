package com.ani.practise.linkedlists;

public class LinkedListMain {

    public static void main(String[] args) {
	{
	    LinkedList list = new LinkedList();
	    list.createSingleLinkedList(5);
	    list.traverseLinkedList();

	    list.insertIntoLinedList(10, 1);
	    list.traverseLinkedList();

	    list.insertIntoLinedList(20, 2);
	    list.traverseLinkedList();

	    list.insertIntoLinedList(30, 2);
	    list.traverseLinkedList();

	    list.insertIntoLinedList(40, 1);
	    list.traverseLinkedList();

	    list.traverseLinkedList();
	    System.out.println();

	    System.out.println("\nSearching the node having value 40...");
	    list.searchNode(40);

	    System.out.println("\nSearching the node having value 500...");
	    list.searchNode(500);

	    System.out.println("\n\nDeleting the node having location = 0: ");
	    System.out.println("Before Deletion:");
	    list.traverseLinkedList();
	    list.deleteNode(0);
	    System.out.println("After Deletion:");
	    list.traverseLinkedList();
	    System.out.println();

	    System.out.println("\n\nDeleting the node having location = 2: ");
	    System.out.println("Before Deletion:");
	    list.traverseLinkedList();
	    list.deleteNode(2);
	    System.out.println("After Deletion:");
	    list.traverseLinkedList();
	    System.out.println();

	    System.out.println("\n\nDeleting the node having location = 100: ");
	    System.out.println("Before Deletion:");
	    list.traverseLinkedList();
	    list.deleteNode(100);
	    System.out.println("After Deletion:");
	    list.traverseLinkedList();
	    System.out.println();

	    list.fullyDeleteLinkedList();
	    list.traverseLinkedList();

	}

    }

}
