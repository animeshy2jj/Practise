package com.ani.practise.stack;

public class StackArrayMain {

    public static void main(String[] args) {
	StackusingArray<String> st = new StackusingArray<String>();
	st.createStack(5);
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
	st.deleteStack();
	st.printStack();
    }

}
