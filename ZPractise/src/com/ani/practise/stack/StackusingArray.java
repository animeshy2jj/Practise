package com.ani.practise.stack;

public class StackusingArray<T> {
    Object[] array;
    int curent = 0;

    void createStack(int size) {
	array = new Object[size];
    }

    void push(T value) {
	if (curent < array.length) {
	    array[curent] = value;
	    curent++;
	} else
	    System.out.println("Stack is FULL.");
    }

    T pop() {
	T temp = null;
	if (!isEmpty()) {
	    curent--;
	    temp = (T) array[curent];
	    array[curent] = null;
	    return temp;

	} else {
	    return (T) "Nothing to POP.";
	}

    }

    T peek() {
	T temp = null;
	if (!isEmpty()) {
	    temp = (T) array[curent - 1];
	    return temp;

	} else {
	    return (T) "STACK Empty";
	}
    }

    boolean isEmpty() {
	if (array[0] == null)
	    return true;
	else
	    return false;
    }

    void printStack() {
	if (array != null)
	    for (Object a : array) {
		if (a != null)
		    System.out.println(String.valueOf(a));
	    }
	else
	    System.out.println("NO STACK EXIST.");
    }

    void deleteStack() {
	array = null;
    }

}
