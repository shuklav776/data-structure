package com.java.datastructure.sort;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SelectionSort {

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

		for (int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastIndex; i++) {
				if (arr[largest] < arr[i]) {
					largest = i;
				}
			}
			swap(arr, largest, lastIndex);
		}

		System.out.println("Extecution time of algo in nano sec: " + (System.nanoTime() - startTime));
		System.out.println(
				"Extecution time of algo in sec: " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
