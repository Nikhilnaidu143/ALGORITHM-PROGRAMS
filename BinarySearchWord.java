package com.algorithm.problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	
	/*** Binary search method using Recursive strategy. ***/
	public static int binarySearch(String[] array , int first , int last , String input_word) {
	
		int mid = (first+last)/2;                             // calculating mid index number of a given array.              
	
		if(input_word.compareToIgnoreCase(array[mid]) == 0) {
			return mid;                                           // if user searched wored matched with mid indexed element. it will return the index num.
		}
		else if((input_word.compareToIgnoreCase(array[mid])) > 0) {
			first = mid + 1;                                           //searching the right sub-array.
			return binarySearch(array, first, last, input_word);
		}
		else if(input_word.compareToIgnoreCase(array[mid]) < 0) {
			last = mid - 1;                                             //searching the left sub-array.
			return binarySearch(array, first, last, input_word);
		}
		else {
			return -1;
		}	
	}
	
	/*** print Result method ***/
	public static void printResult(int result , String input_word) {
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
		
		int first = 0;
		int last = array.length - 1;                  
		
		int result = binarySearch(array , first , last , input_word);    // calling binarySearch method by passing parameters.

		printResult(result, input_word);         // calling printResult method .
	}
}
