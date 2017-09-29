package com.ali.zeeshan.week02.impl;

/**The package 'Sorter' has been imported to use its methods by the class 'MergeSort'. 
 */
import com.ali.zeeshan.week02.iface.Sorter;

/**
 * This class contains methods for merge sort algorithm
 */
public class MergeSort {

	private void mergeAscending(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	private void mergeDescending(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	/**
	 * This method is for putting the array in an ascending order
	 * 
	 */
	public int sortAscending(int arr[], int l, int r) {
		if (l < r) {

			int m = (l + r) / 2;
			sortAscending(arr, l, m);
			sortAscending(arr, m + 1, r);
			mergeAscending(arr, l, m, r);

		}

		return 0;

	}

	/**
	 * This method is for putting the array in an descending order
	 * 
	 */
	public int sortDescending(int arr[], int l, int r) {
		if (l < r) {

			int m = (l + r) / 2;
			sortDescending(arr, l, m);
			sortDescending(arr, m + 1, r);
			mergeDescending(arr, l, m, r);

		}

		return 0;

	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
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
		ms.sortAscending(arr, 0, arr.length - 1);
		System.out.print("The Ascending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");
		System.out.println("");
		/**
		 * Call for sortDescending method
		 * 
		 */

		ms.sortDescending(arr, 0, arr.length - 1);
		System.out.print("The Descending order is: ");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + ", ");

	}

}
