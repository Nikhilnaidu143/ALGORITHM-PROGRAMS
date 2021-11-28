package com.algorithm.problems;

import java.util.Arrays;

public class Insertion_Sort {

	/*** Insertion sort method ***/
	public void insertion_sorting(String[] array) {
		for(int i = 1; i < array.length; i++) {
			String key = array[i];               
			int index = i - 1;
			while(index >= 0) {
				if(key.compareTo(array[index]) > 0) {
					break;
				}
				array[index + 1] = array[index];       // swapping
				index--;
			}
			array[index + 1] = key;           // swapping
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));
	}
	
	/*** Main Method ***/
	public static void main(String[] args) {
		/*** Displaying welcome message ***/
		System.out.println("-------------Welcome To Insertion Sorting--------------\n");
		
		String array[] = {"E","D","C","B","A","Z","U","X","G"};
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		/** Creating object of Insertion_Sort class **/
		Insertion_Sort insertionSort = new Insertion_Sort();
		
		insertionSort.insertion_sorting(array);  // calling insertion_sorting method by passing String array.
	}
}
