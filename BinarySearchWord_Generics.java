package com.algorithm.problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord_Generics <T extends Comparable <T>> {
	/*** Binary search method using Recursive strategy. ***/
	public static <T extends Comparable <T>> Integer binarySearch(T[] array , int first , int last , T input_word) {
	
		Integer mid = (first + last)/2;                             // calculating mid index number of a given array.              
	
		if(((String) input_word).compareToIgnoreCase((String) array[mid]) == 0) {
			return mid;                                           // if user searched wored matched with mid indexed element. it will return the index num.
		}
		else if((((String) input_word).compareToIgnoreCase((String) array[mid])) > 0) {
			first = mid + 1;                                           //searching the right sub-array.
			return binarySearch(array, first, last, input_word);
		}
		else if(((String) input_word).compareToIgnoreCase((String) array[mid]) < 0) {
			last = mid - 1;                                             //searching the left sub-array.
			return binarySearch(array, first, last, input_word);
		}
		else {
			return -1;
		}	
	}
	
	/*** print Result method ***/
	public static <T extends Comparable<T>> void printResult(Integer result , String input_word) {
		if(result == -1) {
			System.out.println("\n" + input_word + " is not found in the array.");
		}
		else {
			System.out.println("\n" + input_word + " is found at index " + result + ".");
		}
	}
	
	/**** Main Method ****/
	public static void main(String[] args) {
		/*** Displaying Welcome message ***/
		System.out.println("--------------WELCOME TO BINARY SEARCH THE WORD FROM AN ARRAY----------------\n");
		
		String[] array = {"cat","dog","bat","horse","lion","tiger","monkey","zebra","elephant","rat"};
		
		Arrays.sort(array);                          // sorting the given array
		
		System.out.println("Sorted Array :-  " + Arrays.toString(array));     
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a word to search :- ");
		String input_word = input.nextLine();        // taking input from user which word he wants to search.
		
		Integer first = 0;
		Integer last = array.length - 1;                  
		
		Integer result = binarySearch(array , first , last , input_word);    // calling binarySearch method by passing parameters.

		printResult(result, input_word);         // calling printResult method .
	}
}
