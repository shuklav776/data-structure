package com.java.datastructure.sort;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BubbleSort {

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

		for (int lastindex = len - 1; lastindex > 0; lastindex--) {
			for (int i = 0; i < lastindex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
		
		System.out.println("Extecution time of algo in nano sec: " + (System.nanoTime() - startTime));
		System.out.println("Extecution time of algo in sec: " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));

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
