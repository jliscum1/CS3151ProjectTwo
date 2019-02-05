/**
 * 
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
		FileWriter writer = null;
		try {
			File file = new File("data.csv");
			writer = new FileWriter(file);
			StringBuilder builder = new StringBuilder();
			builder.append(formatter.headerOutPut());
			builder.append(formatter.generateOutPutForSorts());
			writer.append(builder.toString());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done!");
	}

}
