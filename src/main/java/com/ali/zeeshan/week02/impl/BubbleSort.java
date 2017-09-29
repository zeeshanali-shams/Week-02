package com.ali.zeeshan.week02.impl;

/**The package 'Sorter' has been imported to use its methods by the class 'BubbleSort'. 
 */
import com.ali.zeeshan.week02.iface.Sorter;

/**
 * This class contains methods for bubble sort algorithm
 */
public class BubbleSort {
	/**
	 * This method is for putting the array in an ascending order
	 * 
	 */
	public int sortAscending(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		return 0;

	}

	/**
	 * This method is for putting the array in an descending order
	 * 
	 */
	public int sortDescending(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return 0;

	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 15, 36, 73, 10, 46, 24, 58, 79 };
		int n = arr.length;
		System.out.print("Given Array: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortAscending method
		 * 
		 */
		bs.sortAscending(arr);
		System.out.print("The Ascending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortDescending method
		 * 
		 */
		bs.sortDescending(arr);
		System.out.print("The Descending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
	}

}
