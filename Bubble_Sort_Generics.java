package com.algorithm.problems;

import java.util.Arrays;

public class Bubble_Sort_Generics <T extends Comparable<T>> {
	/*** Sorting the int array. **/
	public static <T extends Comparable<T>> void bubbleSorting(T[] array) {
		for(Integer i = 0 ; i < array.length; i++) {
			for(Integer j = 0; j < array.length-1-i; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					Integer temp = (Integer) array[j];             // temp variable to store array[j].
					array[j] = array[j+1];			// swaping array[j] and array[j+1].
					array[j+1] = (T) temp;
				}
			}
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));    
	}
	
	/*** Main Method ***/
	public static void main(String[] args) {
		/*** Displaying Welcome Message ***/
		System.out.println("-------------Welcome To Bubble Sorting-------------\n");
		
		Integer array[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		Bubble_Sort_Generics.bubbleSorting(array);        // calling bubblesorting method by passying Integer array.
	}
}
