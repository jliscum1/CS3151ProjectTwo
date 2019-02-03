package edu.westga.cs3151.io;

import controller.TestDriver;

public class OutPutFormatter {
	public TestDriver testDriver;

	public OutPutFormatter() {
		this.testDriver = new TestDriver();
	}

	public String generateOutPut() {
		int steps = 0;

		while (steps <= 20) {
			int length = 0;

			while (length <= 100) {
				this.testDriver.setArrayLengthAndPopulate(length);

			}

		}
		return "";
	}

}
