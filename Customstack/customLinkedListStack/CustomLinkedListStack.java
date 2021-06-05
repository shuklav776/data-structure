package com.java.datastructure.Customstack.customLinkedListStack;

import java.util.EmptyStackException;

public class CustomLinkedListStack<E> {

	private int size = 0;

	Node<E> first;

	Node<E> last;

	public CustomLinkedListStack() {

	}

	private static class Node<E> {
		E item;
		Node<E> prev;
		Node<E> next;

		Node(Node<E> prev, E element, Node<E> next) {
			this.prev = prev;
			this.item = element;
			this.next = next;
		}
	}

	public void push(E e) {
		addFirst(e);
	}

	private void addFirst(E e) {
		final Node<E> f = first;
		final Node<E> newNode = new Node<>(null, e, f);
		first = newNode;
		if (f == null)
			last = newNode;
		else
			f.prev = newNode;
		size++;
	}

	public E pop() {
		return removeFirst();
	}

	private E removeFirst() {
		final Node<E> f = first;
		if (f == null)
			throw new EmptyStackException();
		final E element = f.item;
		final Node<E> next = f.next;
		f.item = null;
		f.next = null;
		first = next;
		if (next == null)
			last = null;
		else
			next.prev = null;
		size--;
		return element;
	}

	public E peek() {
		final Node<E> f = first;
		return (f == null) ? null : f.item;
	}

	public int size() {
		return size;
	}

	public void printStack() {
		if (first == null && last == null)
			throw new EmptyStackException();
		for (Node<E> x = last; x != null; x = x.prev)
			System.out.println(x.item);
	}
}
