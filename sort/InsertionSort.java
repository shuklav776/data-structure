package com.java.datastructure.sort;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of arr: ");
		int len = sc.nextInt();
		System.out.println("Enter element in array: ");
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		final long startTime = System.nanoTime();

		for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
			int newElement = arr[unsortedIndex];
			int i;
			for (i = unsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
				arr[i] = arr[i - 1];
			}
			arr[i] = newElement;
		}
		
		System.out.println("Extecution time of algo in nano sec: " + (System.nanoTime() - startTime));
		System.out.println(
				"Extecution time of algo in sec: " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
