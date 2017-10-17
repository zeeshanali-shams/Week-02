package com.ali.zeeshan.week02.impl;

/**
 * MergeSorter uses merge sort algorithm. MergeSorter inherits ArrayPrinter.
 */
public class MergeSorter extends ArrayPrinter {

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

	private void doSortAscending(int l, int h) {

		if (l < h) {
			int middle = l + (h - l) / 2;
			doSortAscending(l, middle);
			doSortAscending(middle + 1, h);
			mergePartsAscending(l, middle, h);
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

	/**
	 * Method for sorting in descending order
	 * 
	 */
	public void sortDescending(int[] a) {

		sortAscending(a);
		reverseArray(a);
	}

	public static void main(String[] args) {
		MergeSorter ms = new MergeSorter();
		System.out.println("MERGE SORT");
		int arr[] = { 15, 36, 73, 10, 46, 24, 58, 79 };
		ms.printArray(arr);
	}

}
