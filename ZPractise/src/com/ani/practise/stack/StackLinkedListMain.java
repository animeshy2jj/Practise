package com.ani.practise.stack;

public class StackLinkedListMain {

    public static void main(String[] args) {
	StackUsingLinkedList<String> st = new StackUsingLinkedList<String>();
	st.push("A");
	st.push("B");
	st.push("C");
	st.push("D");
	st.push("E");
	st.push("F");
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
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
	System.out.println("POPPED :" + st.pop());
	System.out.println("PEEK :" + st.peek());
//	st.deleteStack();
	st.printStack();

    }

}
