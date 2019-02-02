package controller;

import model.SortTools;

/**
 * Driver for testing the 5 basic sorting algorithms
 * 
 * @author CS3151 Spring 2019
 *
 */

public class TestDriver {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[1000];
		
		boolean display = false;
		for(int i=0;i<array.length;i++) {
			array[i] = i;
		}
		
		SortTools.shuffle(array);
		
		if(display) {
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
				if(i%20 == 19) {
					System.out.println();
				}
			}
		}

		long start = System.nanoTime();
		SortTools.insertionSort(array);
		long stop = System.nanoTime();

		if(display) {
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
				if(i%20 == 19) {
					System.out.println();
				}
			}
		}

		
		System.out.println(stop-start);
	}
	

}
