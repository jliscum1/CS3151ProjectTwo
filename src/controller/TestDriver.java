package controller;

import model.SortTools;

/**
 * Driver for testing the 5 basic sorting algorithms
 * 
 * @author CS3151 Spring 2019
 *
 */

public class TestDriver {
	public Integer[] array;

	/**
	 * Sets the array
	 * 
	 * @param array
	 */
	public void setArrayLengthAndPopulate(int length) {
		this.array = new Integer[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	/**
	 * Gets the time of the insertion sort
	 * 
	 * @return time of insertion sort
	 */
	public long getTimeOfInsertionSort() {
		SortTools.shuffle(this.array);
		long start = System.nanoTime();
		SortTools.insertionSort(this.array);
		long stop = System.nanoTime();
		return -1 * (start - stop);
	}

	/**
	 * Gets the time of the selection sort
	 * 
	 * @return time of the the selection sort
	 */
	public long getTimeOfSelectionSort() {
		SortTools.shuffle(this.array);
		long start = System.nanoTime();
		SortTools.selectionSort(this.array);
		long stop = System.nanoTime();
		return -1 * (start - stop);

	}

	/**
	 * Gets the time of the bubble sort
	 * 
	 * @return time of the bubble sort
	 */
	public long getTimeOfBubbleSort() {
		SortTools.shuffle(this.array);
		long start = System.nanoTime();
		SortTools.bubbleSort(this.array);
		long stop = System.nanoTime();
		return -1 * (start - stop);

	}

	/**
	 * Gets the time of the merge sort
	 * 
	 * @return time of the merge sort
	 */
	public long getTimeOfMergeSort() {
		SortTools.shuffle(this.array);
		long start = System.nanoTime();
		SortTools.mergeSort(this.array);
		long stop = System.nanoTime();
		return -1 * (start - stop);
	}

	/**
	 * Gets the time of the quick sort
	 * 
	 * @return time of the quick sort
	 */
	public long getTimeOfQuickSort() {
		SortTools.shuffle(this.array);
		long start = System.nanoTime();
		SortTools.mergeSort(this.array);
		long stop = System.nanoTime();
		return -1 * (start - stop);
	}

}
