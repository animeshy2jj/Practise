package com.ani.practise.pq;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsage {

    public static void main(String[] args) {
	Comparator<Integer> intComp = (i, j) -> {
	    return j - i;
	};
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(intComp);
	pq.add(1);
	pq.add(2);
	pq.add(1);
	System.out.println(pq);
	pq.remove();
	System.out.println(pq);
	pq.remove();
	System.out.println(pq);
    }

    public void use() {
    }

}
