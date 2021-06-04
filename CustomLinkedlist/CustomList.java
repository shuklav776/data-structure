package com.java.datastructure.CustomLinkedlist;

public interface CustomList<E> {
	boolean add(E e);

	int size();

	Object[] toArray();

	E remove(int index);
	
	E get(int index);
}
