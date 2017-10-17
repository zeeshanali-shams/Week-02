package com.ali.zeeshan.week02.iface;

/**
 * This interface represents a Sorter. It provides two methods to sort an
 * integer in ascending or descending order.
 */
public interface Sorter {

	/**
	 * Sorts in ascending order
	 */
	public void sortAscending(int[] arr);

	/**
	 * Sorts in descending order
	 */
	public void sortDescending(int[] arr);

	/**
	 * Prints the array
	 * 
	 */
	public void printArray(int[] arr);

	/**
	 * Reverses the array
	 * 
	 */
	public void reverseArray(int[] arr);
}
