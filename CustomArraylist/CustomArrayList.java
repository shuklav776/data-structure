package com.java.datastructure.CustomArraylist;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public class CustomArrayList<E> implements CustomList<E>, RandomAccess, Cloneable, Serializable {

	@java.io.Serial
	private static final long serialVersionUID = 12390L;

	private static final int DEFAULT_CAPACITY = 10;

	private static final Object[] EMPTY_ELEMENTDATA = {};

	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	private int size;

	transient Object[] elementData;

	private transient int modCount = 0;

	public CustomArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	public CustomArrayList() {
		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}

	public CustomArrayList(Collection<? extends E> c) {
		Object[] a = c.toArray();
		if ((size = a.length) != 0) {
			if (c.getClass() == CustomArrayList.class) {
				elementData = a;
			} else {
				elementData = Arrays.copyOf(a, size, Object[].class);
			}
		} else {
			elementData = EMPTY_ELEMENTDATA;
		}
	}

	public int size() {
		return size;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(elementData, size);
	}

	@Override
	public boolean add(E e) {
		checkCapacity(size + 1);
		elementData[size++] = e;
		return true;
	}

	private void checkCapacity(int minCap) {
		modCount++;
		int oldCap = elementData.length;
		if (minCap > oldCap) {
			Object objData[] = elementData;
			int newCap = (oldCap * 3) / 2 + 1;

			if (newCap < minCap)
				newCap = minCap;
			elementData = (Object[]) new Object[newCap];
			System.arraycopy(objData, 0, elementData, 0, size);
		}
	}

	@Override
	public E get(int index) {
		Objects.checkIndex(index, size);
		return elementData(index);
	}

	@SuppressWarnings("unchecked")
	private E elementData(int index) {
		return (E) elementData[index];
	}

	@Override
	public boolean remove(int index) {
		Objects.checkIndex(index, size);
		return removeDataFromIndex(index);
	}

	private boolean removeDataFromIndex(int index) {
		modCount--;
		int i = size - index - 1;
		if (i > 0)
			System.arraycopy(elementData, index + 1, elementData, index, i);
		elementData[--size] = null;
		return true;
	}

}
