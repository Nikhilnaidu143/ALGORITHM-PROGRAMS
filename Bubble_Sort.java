package com.algorithm.problems;

import java.util.Arrays;

public class Bubble_Sort {

	/*** Sorting the int array. **/
	public void bubbleSorting(int[] array) {
		for(int i = 0 ; i < array.length; i++) {
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];             // temp variable to store array[j].
					array[j] = array[j+1];			// swaping array[j] and array[j+1].
					array[j+1] = temp;
				}
			}
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));    
	}
	
	/*** Main Method ***/
	public static void main(String[] args) {
		/*** Displaying Welcome Message ***/
		System.out.println("-------------Welcome To Bubble Sorting-------------\n");
		
		int array[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		Bubble_Sort bubbleSort = new Bubble_Sort();   // crating object for Bubble_Sort class
		
		bubbleSort.bubbleSorting(array);        // calling bubblesorting method by passying int array.
	}
}
