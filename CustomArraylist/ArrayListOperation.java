package com.java.datastructure.CustomArraylist;

public class ArrayListOperation {
	public static void main(String[] args) {
		CustomList<String> list = new CustomArrayList<>();

		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		Object[] arr = list.toArray();
		for (Object ob : arr)
			System.out.println(ob);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("List size: " + list.size());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(list.get(1));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(list.remove(0));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		Object[] newArr = list.toArray();
		for (Object ob : newArr)
			System.out.println(ob);
	}
}
