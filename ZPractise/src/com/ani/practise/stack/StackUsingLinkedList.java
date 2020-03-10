package com.ani.practise.stack;

public class StackUsingLinkedList<T> {
    Node<T> head = null;
    Node<T> current = null;

    void push(T data) {
	Node<T> node = new Node<T>();
	node.setData(data);
	node.setNext(null);
	if (head == null) {
	    head = node;
	    current = node;
	} else {
	    node.setNext(head);
	    head = node;
	}
    }

    T pop() {
	if (head == null) {
	    return (T) "Empty Stack.";
	} else {
	    T data = head.getData();
	    head = (Node<T>) head.next;
	    return data;
	}
    }

    T peek() {
	if (head == null) {
	    return (T) "Empty Stack.";
	} else {
	    T data = head.getData();
	    return data;
	}
    }

    public void printStack() {
	if (head == null) {
	    System.out.println("Empty Stack.");
	} else {
	    Node<T> node = head;
	    while (node.getNext() != null) {
		System.out.print(node.getData() + "->");
		node = (Node<T>) node.next;
	    }
	    System.out.println(node.getData());
	}
    }
}

class Node<T> {
    Node<?> next;
    T data;

    public Node<?> getNext() {
	return next;
    }

    public void setNext(Node<?> next) {
	this.next = next;
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

}
