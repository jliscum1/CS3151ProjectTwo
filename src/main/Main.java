/**
 * 
 */
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

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
		try {
			FileOutputStream stream = new FileOutputStream("sortdata.csv", true);
			PrintWriter print = new PrintWriter(stream);
			print.println(formatter.headerOutPut());
			print.println(formatter.generateOutPutForSorts());
			print.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.print("done");

	}

}
