/**
 * 
 */
package edu.westga.cs3151.io;

import java.io.File;
import java.io.FileWriter;

/**
 * @author Jeremiah Liscum Outputs Sorting Algorithms Data on to a csv file
 *
 */
public class SortingCSVFileWriter {
	FileWriter csvFileWriter;

	public SortingCSVFileWriter() {
		try {
			this.csvFileWriter = new FileWriter(new File("sorting.csv"));
		}
		catch(Exception e) {
			
		}
		
	}

}
