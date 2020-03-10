package com.ani.practise.stack;

public class StackLinkedListMain {

    public static void main(String[] args) {
	StackUsingLinkedList<Integer> st = new StackUsingLinkedList<Integer>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	st.push(5);
	st.push(6);
	st.printStack();
	System.out.println("PEEK :" + st.peek());
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
//	st.deleteStack();
	st.printStack();

    }

}
