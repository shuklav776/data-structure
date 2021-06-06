package com.java.datastructure.customQueue;

import java.util.NoSuchElementException;

public class CustomQueue<E> {

	private Object[] elementData;

	private int front;

	private int back;

	public CustomQueue(int capacity) {
		elementData = new Object[capacity];
	}

	public void add(E e) {
		if (size() == elementData.length - 1) {
			int numItems = size();
			Object[] newArray = new Object[2 * elementData.length];
			System.arraycopy(elementData, front, newArray, 0, elementData.length - front);
			System.arraycopy(elementData, 0, newArray, elementData.length - front, back);

			elementData = newArray;
			front = 0;
			back = numItems;
		}
		elementData[back] = e;
		if (back < elementData.length - 1) {
			back++;
		} else {
			back = 0;
		}
//		size();
	}

	@SuppressWarnings("unchecked")
	public E remove() {
		if (size() == 0)
			throw new NoSuchElementException();
		Object element = elementData[front];
		elementData[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		} else if (front == elementData.length) {
			front = 0;
		}
//		size();
		return (E) element;

	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (size() == 0)
			throw new NoSuchElementException();
		return (E) elementData[front];
	}

	public void printQueue() {
		if (size() == 0)
			throw new NoSuchElementException();
		if (front <= back) {
			for (int i = front; i < back; i++) {
				System.out.println(elementData[i]);
			}
		} else {
			for (int i = front; i < elementData.length; i++) {
				System.out.println(elementData[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(elementData[i]);
			}
		}
	}

	private int size() {
		if (front <= back) {
//			System.out.println("back: " + back + " front: " + front + ", back - front =" + (back - front));
			return back - front;
		} else {
//			System.out.println("back: " + back + " front: " + front + ", back - front + elementData.length ="
//					+ (back - front + elementData.length));
			return back - front + elementData.length;
		}
	}
}
