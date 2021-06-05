package com.java.datastructure.Customstack.customLinkedListStack;

public class LinkedListStackOperation {

	public static void main(String[] args) {

		CustomLinkedListStack<String> stack = new CustomLinkedListStack<>();

		stack.push("11");
		stack.push("22");
		stack.push("33");

		System.out.println("size--->" + stack.size());

		stack.pop();
		stack.printStack();
		System.out.println("peek--->" + stack.peek());

	}
}
