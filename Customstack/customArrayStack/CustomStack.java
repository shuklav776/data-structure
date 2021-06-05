package com.java.datastructure.Customstack.customArrayStack;

import java.util.EmptyStackException;

public class CustomStack<E> {

	private Object[] elementData;

	private int top;

	public CustomStack(int initialCapa) {
		this.elementData = new Object[initialCapa];
	}

	public void push(E e) {
		if (top == elementData.length) {
			Object[] newArr = new Object[2 * elementData.length];
			System.arraycopy(elementData, 0, newArr, 0, elementData.length);
			elementData = newArr;
		}
		elementData[top++] = e;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();
		Object obj = elementData[--top];
		elementData[top] = null;
		return (E) obj;
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return (E) elementData[top - 1];
	}

	public int size() {
		return top;
	}

	private boolean isEmpty() {
		return top == 0;
	}

	public void printStack() {
		if (isEmpty())
			throw new EmptyStackException();
		for (int i = top - 1; i >= 0; i--)
			System.out.println(elementData[i]);
	}
}
