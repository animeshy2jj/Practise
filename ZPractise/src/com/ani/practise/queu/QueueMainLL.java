package com.ani.practise.queu;

public class QueueMainLL {

    public static void main(String[] args) {
	QueueUsingList<Integer> q = new QueueUsingList<Integer>();
	q.createQueue(1, 5);

	q.enqueue(2);
	q.dequeue();
	q.print();
	q.enqueue(3);

	q.enqueue(4);

	q.enqueue(5);

	q.print();
    }

}
