package com.algorithm.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class FindYourNumber {
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);
	
	/*** Adding numbers into arrayList ***/
	public static void addingNumbersToArrayList(int N) {
		for(int i = 0; i <= N; i++) {
			arrayList.add(i);
		}
	}

	/*** Find your number using recursive Strategy of Binary-Search method ***/
	public static int findingNumberBinarySearch(ArrayList<Integer> arrayList , int first , int last) {
		
		int mid = (first+last)/2;         // calculating mid-point of the arrayList.
	
		System.out.print("\nEnter -1 if your number is less than " + mid + 
				         "\nEnter 0 if your number is equal to " + mid +
				         "\nEnter 1 if your number is greater than " + mid + "   :-   ");
		int choice = input.nextInt();
		
		if(choice == 0) {                      
			return mid;
		}
		else if(choice == -1) {
			last = mid - 1;                                      
			return findingNumberBinarySearch(arrayList, first, last);    //finding number in the left part of the arrayList.
		}
		else if(choice == 1) {
			first = mid + 1;
			return findingNumberBinarySearch(arrayList, first, last);    //finding number in the right part of the arrayList.
		}
		else {
			return -1;      // return -1 if user's number is out of range.
		}
	}
	
	/*** Printing results method ***/ 
	public static void printResult(int result) {
		if(result == -1) {
			System.out.println("\nPlease choose a valid option.");
		}
		else {
			System.out.println("\nHurray! Found your number and your number is :- " + result);
		}
	}
	
	
	/**** Main Method ****/
	public static void main(String[] args) {
		System.out.println("--------------WELCOME TO FIND YOUR NUMBER PROGRAM--------------\n");
		
		System.out.print("Enter maximum number to select range :- ");
		int N = input.nextInt();                                          //Asking user to select ranger i.e., 0 to N.
		
		FindYourNumber.addingNumbersToArrayList(N);     // calling method to add numbers into an arraylist.
		
		System.out.print("\n..............Choose any number from 0 to " + N +"...............");
		
		System.out.print("\nEnter 1 to start :- ");
		int start = input.nextInt();                   
		
		if(start == 1) {
			int first = 0;
			int last = arrayList.size();              
			
			int result = findingNumberBinarySearch(arrayList , first , last);
			
			FindYourNumber.printResult(result);
		}
		else {
			System.out.println("\nPlease enter only 1 to start.");
		}
	}
}
