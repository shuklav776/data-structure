package com.java.datastructure.CustomLinkedlist;

public class LinkedListOperation {

	public static void main(String[] args) {

		CustomList<String> list = new CustomLinkedList<>();

		list.add("11");
		list.add("22");
		list.add("33");
		list.add("44");

		Object[] arr = list.toArray();

		for (Object obj : arr)
			System.out.println(obj);

		System.out.println("Get method --->" + list.get(3));
	}

}
