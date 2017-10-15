package com.ali.zeeshan.week02.impl;

/**
 * Package "com.ali.zeeshan.week02.iface" contains interface 'Sorter'.
 */
import com.ali.zeeshan.week02.iface.Sorter;

/**
 * Interface 'Sorter' has been implemented by the class 'BubbleSort'
 */
public class BubbleSort implements Sorter {
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
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 15, 36, 73, 10, 46, 24, 58, 79 };
		int n = arr.length;
		System.out.print("Given Array: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		System.out.println("By bubble sort:-");
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
