package com.java.datastructure.Customstack.customArrayStack;

public class CustomStackOperation {

	public static void main(String[] args) {
 
		CustomStack<String> stack = new CustomStack<>(3);
		stack.push("11");
		stack.push("22");
		stack.push("55");
		stack.push("77");

		System.out.println("size-->"+ stack.size());
		stack.pop();
		System.out.println("size after pop-->"+ stack.size());
		stack.printStack();
		
	}

}
