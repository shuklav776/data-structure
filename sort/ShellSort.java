package com.java.datastructure.sort;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ShellSort {

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

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int newElement = arr[i];

				int j = i;

				while (j >= gap && arr[j - gap] > newElement) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = newElement;
			}
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
