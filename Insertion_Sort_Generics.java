package com.algorithm.problems;

import java.util.Arrays;

public class Insertion_Sort_Generics <T extends Comparable<T>> {
	/*** Insertion sort method ***/
	public static <T extends Comparable<T>> void insertion_sorting(T[] array) {
		for(Integer i = 1; i < array.length; i++) {
			T key = array[i];               
			Integer index = i - 1;
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
		
		Insertion_Sort_Generics.insertion_sorting(array);  // calling insertion_sorting method by passing String array.
	}
}
