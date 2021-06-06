package com.java.datastructure.customQueue;

public class QueueOperation {

	public static void main(String[] args) {

		CustomQueue<String> queue = new CustomQueue<>(5);
		queue.add("Jane");
		queue.add("Doe");
		queue.remove();
		queue.add("Mary");
		queue.remove();
		queue.add("Mike");
		queue.remove();
		queue.add("Bill");
		queue.add("Dev");
		queue.add("Zin");
		queue.add("Jane");

		queue.printQueue();
	}

}
