package edu.westga.cs3151.io;

import controller.TestDriver;

public class OutPutFormatter {
	public TestDriver testDriver;
	private static final int STOP = 100;
	private static final int STEP = 1;

	public OutPutFormatter() {
		this.testDriver = new TestDriver();
	}

	public String headerOutPut() {
		return "size,insertion sort,selection sort,bubble sort,quick sort,merge sort" + System.lineSeparator();
	}

	/**
	 * Generates output for insertion sort
	 * 
	 * @return the output for insertion sort
	 */
	public String generateOutPutForSorts() {
		String outPut = "";

		for (int i = 1000; i <= 100000; i += 1000) {
			this.testDriver.setArrayLengthAndPopulate(i);
			outPut += i + "," + this.testDriver.getTimeOfInsertionSort() + ","
					+ this.testDriver.getTimeOfSelectionSort() + "," + this.testDriver.getTimeOfBubbleSort() + ","
					+ this.testDriver.getTimeOfQuickSort() + "," + this.testDriver.getTimeOfMergeSort()
					+ System.lineSeparator();

		}
		return outPut;
	}

}
