package com.ali.zeeshan.week02.impl;

import com.ali.zeeshan.week02.iface.Sorter;

public class ArrayPrinter implements Sorter {

	/**
	 * Method to print arrays
	 * 
	 */
	public void printArray(int[] arr) {
		System.out.print("Given Array: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortAscending method
		 * 
		 */
		sortAscending(arr);
		System.out.print("The Ascending order is: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortDescending method
		 * 
		 */
		sortDescending(arr);
		System.out.print("The Descending order is: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + ", ");
	}

	public void sortAscending(int[] arr) {
	}

	public void sortDescending(int[] arr) {
	}

	/**
	 * Reverses the array sequence
	 * 
	 */
	public void reverseArray(int[] arr) {
		int temp = 0, i = 0;
		for (i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

}
