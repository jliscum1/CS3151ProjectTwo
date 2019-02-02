package model;

import java.util.Random;
/**
 * 
 * Static methods to study the complexity of the
 * basic sorting algorithms
 * 
 * @author CS3151 Spring 2019
 *
 */
public class SortTools {
	
	private final static Random rnd = new Random();
	
	private static <T> void swap(T[] data, int i, int j) {
		T tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
	
	/**
	 * Randomly shuffles the elements of an array
	 * 
	 * @preconditions   data != null
	 * @postconditions none
	 * @param data - the array to be shuffled
	 */
	public static <T> void shuffle(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for shuffle");
		}
		
		for(int n= data.length-1;n>0;n--) {
			int m = rnd.nextInt(n+1);
			if( m!= n) {
				swap(data,m,n);
			}
		}
	}
	
	/**
	 * Insertion sort of a non null array 
	 * 
	 * @preconditions data != null
	 * @postconditions none
	 * @param data -  the array to be sorted
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for insertion sort");
		}
		for (int i=1;i<data.length;i++) {
			T x = data[i];
			int j = i-1;
			while(j>=0 && (data[j].compareTo(x)>0)) {
				//				swap(data,j+1,j);
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = x;
		}
		return;
	}
	
	/**
	 * Selection sort of a non null array 
	 * 
	 * @preconditions data != null
	 * @postconditions none
	 * @param data -  the array to be sorted
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for selection sort");
		}
		for(int i=0; i < data.length-1;i++) {
			int index = i;
			for(int j=i+1;j<data.length;j++) {
				if(data[j].compareTo(data[index]) <0) {
					index = j;
				}
			}
			if( i!= index) {
				swap(data,i,index);
			}
		}
	}
	
	/**
	 * Bubble sort of a non null array 
	 * 
	 * @preconditions data != null
	 * @postconditions none
	 * @param data -  the array to be sorted
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for bubble sort");
		}
		for(int i=data.length - 1;i>0 ; i--) {
			for(int j=0;j<i;j++) {
				if(data[j+1].compareTo(data[j]) < 0) {
					swap(data,j,j+1);
				}
			}
		}
		return;
	}

	/**
	 * Merge sort of a non null array 
	 * 
	 * @preconditions data != null
	 * @postconditions none
	 * @param data -  the array to be sorted
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void mergeSort(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for merge sort");
		}
		T[] temp = (T[]) new Comparable[data.length];
		mergeSort(data,temp,0,data.length);
	}
	

	private static <T extends Comparable<T>> void mergeSort(T[] data,T[] buffer,int min, int max) {
		
		if(max - min <= 1) {
			return;
		}
		int mid = (min+max)/2;
		mergeSort(data,buffer,min,mid);
		mergeSort(data,buffer,mid,max);
		merge(data,buffer,min,mid,max);
	}
	
	private static <T extends Comparable<T>> void merge(T[] data, T[] buffer,int min, int mid, int max) {
		int i = min;
		int j = mid;
		
		int current = min;
		while(i<mid && j<max) {
			if(data[i].compareTo(data[j])<0) {
				buffer[current++] = data[i++];
			}
			else {
				buffer[current++] = data[j++];
			}
		}
		while(i<mid) {
			buffer[current++] = data[i++];
		}
		while(j<max) {
			buffer[current++] = data[j++];
		}
		for(current = min; current<max;current++) {
			data[current] = buffer[current];
		}
	}
	/**
	 * Quick sort of a non null array 
	 * 
	 * @preconditions data != null
	 * @postconditions none
	 * @param data -  the array to be sorted
	 */
	public static <T extends Comparable<T>> void quickSort(T[] data) {
		if( data == null) {
			throw new IllegalArgumentException("Array can not be null for quick sort");
		}
		quickSort(data,0,data.length-1);
	}
	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
		
		if(min >= max) {
			return;
		}
		int mid = partition(data,min,max);
		if(min < mid-1) {
			quickSort(data,min,mid);
		}
		if(mid<max) {
			quickSort(data,mid,max);
		}
	}
	
	private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {
		T pivot = data[min];
		int lower = min;
		int upper = max;
		while(lower<= upper) {
			while(data[lower].compareTo(pivot)<0) {
				lower++;
			}
			while(data[upper].compareTo(pivot)>0) {
				upper--;
			}
			if(lower<= upper) {
				swap(data,lower,upper);
				lower++;
				upper--;
			}
		}
		return lower;
	}
	
	
}
