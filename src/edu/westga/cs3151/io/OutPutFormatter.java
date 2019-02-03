package edu.westga.cs3151.io;

import controller.TestDriver;

public class OutPutFormatter {
	public TestDriver testDriver;
	private static final int STOP = 100;
	private static final int STEP = 1;
	private static final int REPEAT = 20;

	public OutPutFormatter() {
		this.testDriver = new TestDriver();
	}

	/**
	 * Generates output for insertion sort
	 * 
	 * @return the output for insertion sort
	 */
	public String generateOutPutForInsertionSort() {
		String outPut = "";
		for (int i = 0; i <= STOP; i += STEP) {
			this.testDriver.setArrayLengthAndPopulate(i);
			outPut +=  this.testDriver.getTimeOfInsertionSort() + System.lineSeparator();

		}
		return outPut;
	}

	/**
	 * Generates output for selection sort
	 * 
	 * @return the output of a selection sort
	 */
	public String generateOutPutForSelctionSort() {
		String outPut = "";
		for (int i = 0; i <= STOP; i += STEP) {
			this.testDriver.setArrayLengthAndPopulate(i);
			outPut += this.testDriver.getTimeOfSelectionSort() + System.lineSeparator();

		}
		return outPut;
	}

	/**
	 * Generate output for a bubble sort
	 * 
	 * @return the output of the bubble sort
	 */
	public String generateOutPutForBubbleSort() {
		String outPut = "";
		for (int i = 0; i <= STOP; i += STEP) {
			this.testDriver.setArrayLengthAndPopulate(i);
			outPut += this.testDriver.getTimeOfBubbleSort() + System.lineSeparator();

		}
		return outPut;
	}
	/**
	 * 
	 */
	public String generateOutPutForQuickSort() {
		String outPut = "";
		for (int i = 0; i <= STOP; i += STEP) {
			this.testDriver.setArrayLengthAndPopulate(i);
			outPut += this.testDriver.getTimeOfQuickSort() + System.lineSeparator();

		}
		return outPut;
	}
}
