package com.ali.zeeshan.week02.impl;

/**
 * Package "com.ali.zeeshan.week02.iface" contains interface 'Sorter'.
 */
import com.ali.zeeshan.week02.iface.Sorter;

/**
 * Interface 'Sorter' has been implemented by the class 'MergeSort'
 */
public class MergeSort implements Sorter {

	private int[] arr;
	private int[] temp;
	private int length;

	/**
	 * Method for sorting in ascending order.
	 * 
	 */
	public void sortAscending(int[] a) {
		this.arr = a;
		this.length = a.length;
		this.temp = new int[length];
		doSortAscending(0, length - 1);

	}

	/**
	 * Method for sorting in descending order
	 * 
	 */
	public void sortDescending(int[] a) {
		this.arr = a;
		this.length = a.length;
		this.temp = new int[length];
		doSortDescending(0, length - 1);

	}

	private void doSortAscending(int l, int h) {

		if (l < h) {
			int middle = l + (h - l) / 2;
			// Below step sorts the left side of the array
			doSortAscending(l, middle);
			// Below step sorts the right side of the array
			doSortAscending(middle + 1, h);
			// Now merge both sides
			mergePartsAscending(l, middle, h);
		}
	}

	private void doSortDescending(int l, int h) {

		if (l < h) {
			int middle = l + (h - l) / 2;
			// Below step sorts the left side of the array
			doSortDescending(l, middle);
			// Below step sorts the right side of the array
			doSortDescending(middle + 1, h);
			// Now merge both sides
			mergePartsDescending(l, middle, h);
		}
	}

	private void mergePartsAscending(int l, int m, int h) {

		for (int i = l; i <= h; i++) {
			temp[i] = arr[i];
		}
		int i = l;
		int j = m + 1;
		int k = l;
		while (i <= m && j <= h) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= m) {
			arr[k] = temp[i];
			k++;
			i++;
		}

	}

	private void mergePartsDescending(int l, int m, int h) {
		for (int i = l; i <= h; i++) {
			temp[i] = arr[i];
		}
		int i = l;
		int j = m + 1;
		int k = l;
		while (i <= m && j <= h) {
			if (temp[i] >= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= m) {
			arr[k] = temp[i];
			k++;
			i++;
		}
	}

	public static void main(String a[]) {
		MergeSort ms = new MergeSort();
		int arr[] = { 15, 36, 73, 10, 46, 24, 58, 79 };
		int n = arr.length;
		System.out.print("Given Array: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		System.out.println("By merge sort:-");
		/**
		 * Call for sortAscending method
		 * 
		 */
		ms.sortAscending(arr);
		System.out.print("The Ascending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortDescending method
		 * 
		 */
		ms.sortDescending(arr);
		System.out.print("The Descending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
	}

}
