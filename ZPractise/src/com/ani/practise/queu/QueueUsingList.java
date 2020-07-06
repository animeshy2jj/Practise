package com.ani.practise.queu;

public class QueueUsingList<T> {
    Node<?> head;
    Node<T> tail;
    int size;
    int sizecount;

    void createQueue(T value, int size) {
	Node<T> node = new Node<T>();
	node.setData(value);
	node.setNext(null);
	if (isEmpty()) {
	    head = node;
	    tail = node;
	    this.size = size;
	    sizecount = 1;
	} else {
	    System.out.println("Queue already exists.");
	}
    }

    void enqueue(T value) {
	if (isFull()) {
	    System.out.println("[ENQUEUE] : Queue Full.");
	} else {
	    Node<T> node = new Node<T>();
	    node.setData(value);
	    node.setNext(null);
	    tail.next = node;
	    tail = node;
	    sizecount++;
	}
    }

    T dequeue() {
	if (isEmpty()) {
	    return (T) "[DEQUEUE] : Queue Empty.";
	} else {
	    Node<?> temp = head;
	    head = head.getNext();
	    temp.next = null;
	    sizecount--;

	    return (T) temp.getData();
	}
    }

    T peek() {
	if (isEmpty()) {
	    return (T) "[DEQUEUE] : Queue Empty.";
	} else {
	    return (T) head.getData();
	}
    }

    boolean isEmpty() {
	if (head == null)
	    return true;
	return false;
    }

    boolean isFull() {
	if (sizecount == size)
	    return true;
	return false;
    }

    void print() {
	if (isEmpty()) {
	    System.out.println("Queue empty.");
	} else {
	    Node<?> temp = head;
	    while (temp.next != null) {
		System.out.print(temp.getData() + "->");
		temp = temp.next;
	    }
	    System.out.println(temp.getData());
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
