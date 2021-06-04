package com.java.datastructure.CustomLinkedlist;

import java.io.Serializable;

public class CustomLinkedList<E> implements CustomList<E>, Cloneable, Serializable {

	transient private int size = 0;

	transient Node<E> first;

	transient Node<E> last;

	private transient int modCount = 0;

	public CustomLinkedList() {

	}

	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.prev = prev;
			this.item = element;
			this.next = next;
		}
	}

	@Override
	public boolean add(E e) {
		linkLast(e);
		return true;
	}

	private void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<>(l, e, null);
		last = newNode;
		if (l == null)
			first = newNode;
		else
			l.next = newNode;
		size++;
		modCount++;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size];
		int i = 0;
		for (Node<E> x = first; x != null; x = x.next)
			arr[i++] = x.item;
		return arr;
	}

	@Override
	public E get(int index) {
		validateIndex(index);
		return node(index).item;
	}

	private void validateIndex(int index) {
		if (!isValidateIndex(index))
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	}

	private boolean isValidateIndex(int index) {
		return index >= 0 && index < size;
	}

	Node<E> node(int index) {
		if (index > (size >> 1)) {
			Node<E> x = first;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		} else {
			Node<E> x = last;
			for (int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}

	}

	@Override
	public E remove(int index) {
		validateIndex(index);
		return unlink(node(index));
	}

	E unlink(Node<E> x) {
		return null;
	}

}