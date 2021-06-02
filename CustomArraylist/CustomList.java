package com.java.datastructure.CustomArraylist;

public interface CustomList<E> {

	boolean add(E e);

	int size();

	Object[] toArray();

	E get(int index);

	boolean remove(int index);
}
