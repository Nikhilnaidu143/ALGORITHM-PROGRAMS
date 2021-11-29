package com.algorithm.problems;

import java.util.Arrays;

public class Merge_Sort_Generics <T extends Comparable<T>>{

	/*** Merge Sorting using recursive method. ***/
	public static <T extends Comparable<T>> void mergeSortingRecursive(T[] array) {
		
		if(array == null) {
			return;
		}
		if(array.length > 1) {
			Integer mid = array.length / 2;     //Finding mid 
			
			/** Left Half of the array **/
			String[] left = new String[mid];
			for(Integer i = 0; i < mid; i++) {
				left[i] = (String) array[i];
			}
			
			/** Right Half of the array **/
			String[] right = new String[array.length - mid];
			for(Integer j = mid; j < array.length; j++) {
				right[j - mid] = (String) array[j];
			}
			
			mergeSortingRecursive(left);       //calling mergeSortingRecursive method for left half of the array.
			mergeSortingRecursive(right);	   //calling mergeSortingRecursive method for right half of the array.
			
			Integer left_index = 0;       // indicating left array index
			Integer right_index = 0;      // indicating right array index
			Integer temp = 0;         //temp variable      
			
			
			/**** Now Merging two arrays i.e., left array and right array. ****/
			while(left_index < left.length && right_index < right.length) {
				if((left[left_index].compareTo(right[right_index])) < 0) {
					array[temp] = (T) left[left_index];
					left_index++;
				}
				else {													/**** MERGE SORT PROCESS   ****/
					array[temp] = (T) right[right_index];               //   3   5   8   7   2   4   1   9      ==>  GIVEN ARRAY
					right_index++;                                  //  -------------------------------------------------
				}													//   3  5  8  7   |    2  4  1  9
				temp++;                                             //  -------------------------------------------------
			}											  		    //   3  5  |  8  7   ||   2  4  |  1  9
																	//	-------------------------------------------------
			/** Remaining elements **/								//   3  |  5   ||  8  |  7     ||    2  | 4  |  1  9 
			while(left_index < left.length) {						//  -------------------------------------------------
				array[temp] = (T) left[left_index];						//   3  5   |   7  8      ||      2  4   |   1  9
				left_index++;										//  -------------------------------------------------
				temp++;                                             //   3  5  7  8    |    1  2  4  9
			}                                                       //  -------------------------------------------------
			while(right_index < right.length) {                     //   1   2   3   4   5   7   8   9      ==> FINAL SORTED ARRAY
				array[temp] = (T) right[right_index];
				right_index++;
				temp++;
			}
		}
	}
	
	/**** Main Method ****/
	public static void main(String[] args) {
		System.out.println("---------------WELCOME TO MERGE-SORT---------------\n");
		
		String[] array = {"C","B","R","N","J","A","W","Z","D","K"};
		System.out.println("\nOriginal String Array :=  " + Arrays.toString(array));          //printing given string array.
	
		Merge_Sort_Generics.mergeSortingRecursive(array);       // calling mergeSortingRecursive method by passing input array to sort recursively.
		
		System.out.println("\nSorted String Array :-  " + Arrays.toString(array));			   //printing sorted String array.
	}
}
