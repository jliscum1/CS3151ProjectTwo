/**
 * 
 */
package main;

import edu.westga.cs3151.io.OutPutFormatter;

/**
 * @author jerem
 *
 */
public class Main {

	/**
	 * Starts Program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		OutPutFormatter formatter = new OutPutFormatter();
		System.out.println(formatter.headerOutPut());
		System.out.print(formatter.generateOutPutForInsertionSort());

	}

}
