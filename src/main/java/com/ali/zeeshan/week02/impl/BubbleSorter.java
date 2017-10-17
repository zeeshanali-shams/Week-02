package com.ali.zeeshan.week02.impl;

/**
 * BubbleSorter uses bubble sort algorithm. BubbleSorter inherits ArrayPrinter.
 */
public class BubbleSorter extends ArrayPrinter {
	/**
	 * Method for sorting in ascending order.
	 * 
	 */
	public void sortAscending(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

	/**
	 * Method for sorting in descending order
	 * 
	 */
	public void sortDescending(int arr[]) {

		sortAscending(arr);
		reverseArray(arr);
	}

	public static void main(String[] args) {
		BubbleSorter bs = new BubbleSorter();
		System.out.println("BUBBLE SORT");
		int arr[] = { 15, 36, 73, 10, 46, 24, 58, 79 };
		bs.printArray(arr);
	}

}
