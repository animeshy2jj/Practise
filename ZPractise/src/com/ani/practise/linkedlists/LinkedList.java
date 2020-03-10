package com.ani.practise.linkedlists;

public class LinkedList {
    private Node head;

    public Node getHead() {
	return head;
    }

    public void setHead(Node head) {
	this.head = head;
    }

    public Node getTail() {
	return tail;
    }

    public void setTail(Node tail) {
	this.tail = tail;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    private Node tail;
    private int size;

    public void createSingleLinkedList(int value) {
	head = new Node();
	Node node = new Node();
	node.setValue(value);
	node.setNext(null);
	head = node;
	tail = node;
	size = 1;
    }

    public void insertIntoLinedList(int value, int location) {

	Node node = new Node();
	node.setValue(value);

	if (head == null) {
	    System.out.println("the linkedlist does not exist.");
	    return;
	} else if (location == 0) {
	    node.setNext(head);
	    head = node;
	} else if (location >= size) {
	    tail.setNext(node);
	    node.setNext(null);
	    tail = node;
	} else {
	    Node tempNode = head;
	    int index = 0;
	    while (index < location - 1) {
		tempNode = tempNode.getNext();
		index++;
	    }
	    node.setNext(tempNode.getNext());
	    tempNode.setNext(node);
	}
	setSize(getSize() + 1);

    }

    void traverseLinkedList() {
	if (head != null) {
	    Node tempNode = head;
	    for (int i = 0; i < getSize(); i++) {
		System.out.println(tempNode.getValue());
		if (i != getSize() - 1) {
		    System.out.print(" -> ");
		}
		tempNode = tempNode.getNext();
	    }
	} else {
	    System.out.println("No Linked List exists.");
	}
    }

    void fullyDeleteLinkedList() {
	System.out.println("deleting linled list...");
	head = null;
	tail = null;
	System.out.println("deleting done.");
    }

    boolean searchNode(int value) {
	if (head != null) {
	    Node tempNode = head;
	    for (int i = 0; i < getSize(); i++) {
		if (tempNode.getValue() == value) {
		    System.out.println("Found at location :" + i);
		    return true;
		}
		tempNode = tempNode.getNext();
	    }
	} else {
	    System.out.println("No Linked List exists.");
	}
	System.out.println("Not Found");
	return false;
    }

    void deleteNode(int location) {

	if (head == null) {
	    System.out.println("No linked list exists");
	} else if (location == 0) {
	    if (size == 1) {
		head = null;
		tail = null;
		setSize(0);
	    } else {
		Node tempnode = head.getNext();
		head.setNext(null);
		head = tempnode;
		setSize(getSize() - 1);
	    }
	} else if (location < getSize()) {
	    Node tempNode = head;
	    for (int i = 0; i < location - 1; i++) {
		tempNode = tempNode.getNext();
	    }
	    if (location == getSize() - 1) {
		tail = tempNode;
		tail.setNext(null);
	    } else {
		Node node = tempNode.getNext().getNext();
		tempNode.getNext().setNext(null);
		tempNode.setNext(node);
	    }
	    setSize(getSize() - 1);
	}

    }

    void print(Node head) {
	if (head == null) {
	    System.out.println("NULL");
	} else {
	    while (head.getNext() != null) {
		System.out.print(head.getValue() + "->");
		head = head.getNext();
	    }
	    System.out.println(head.getValue());
	}
    }

}
