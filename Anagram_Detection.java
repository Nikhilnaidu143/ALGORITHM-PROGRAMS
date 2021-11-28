package com.algorithm.problems;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram_Detection {
	
	/** taking Strings from user method **/
	public static void takingUserInputs() {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("\nEnter first string :- ");
		String string1 = input.nextLine();
		System.out.print("\nEnter second string :- ");
		String string2 = input.nextLine();

		anagram_detection(string1, string2);	// calling anagram_detection method by passing user inputs as String parameters.	
	}

	/** detecting anagram method **/
	public static void anagram_detection(String string1 , String string2) {
		String removeSpacesString1 = string1.replaceAll("\\s", "");      // removing spaces
		String removeSpacesString2 = string2.replaceAll("\\s", "");
		
		if(removeSpacesString1.length() == removeSpacesString2.length()) {    // checking lengths of two strings are equal or not
																			  
			char[] s1 = removeSpacesString1.toLowerCase().toCharArray();    // converting strings into lower case and character array.
			char[] s2 = removeSpacesString2.toLowerCase().toCharArray();
				
			Arrays.sort(s1);                                                 // sorting strings
			Arrays.sort(s2);
			
			if(Arrays.equals(s1, s2)) {                                     // checking sorted char[] arrays are equals or not
					System.out.println("\nGiven two strings are Anagrams.");
			}
			else {
				System.out.println("\nGiven two strings are not Anagrams.");
			}		
		}
		else {
			System.out.println("\nGiven two strings are not Anagrams.");
		}
	}
	
	/** Main method **/
	public static void main(String[] args) {
		/*** Displayed Welcome Message ***/
		System.out.println("--------------WELCOME TO ANAGRAM DETECTION--------------\n");
		
		Anagram_Detection.takingUserInputs();     // calling takingUserInputs method.
	}
}
