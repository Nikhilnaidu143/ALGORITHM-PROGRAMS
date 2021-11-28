package com.algorithm.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramAndPalindrome {
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	/*** Finding Prime Numbers from 0 to 1000 ***/
	public static void primeNumInRange() {	
		for(int index = 0; index <= 1000; index++) {
			int count = 1;                
				for(int num = 2; num <= index; num++) {
					if((index%num) == 0) {
						count++;                       // count --> counts the divisions which gives the remainder 0 when index/num calculates.
					}
					else {
						continue;
					}
				}
				if(count == 2 && index != 1) {
					arrayList.add(index);           // adding prime-numbers to arrayList.
				}
		}
	}
	public static void printArrayList() {
		primeNumInRange();                            // printing prime numbers from 0 to 1000.
		for(Integer primeNums : arrayList) {
			System.out.print(primeNums + "  ");
		}
	}	
	
	/*** Finding palindromic-primes ***/
	public static void palindromicPrimes() {
		primeNumInRange();
		for(int i = 0; i < arrayList.size(); i++) {
			int getNum = arrayList.get(i);          // getting numbers from the arraylist.
			int rem = 0;
			int store = 0;
			int temp = getNum;
			while(getNum > 0) {
				rem = getNum % 10;           //finding remainder of that number.
				getNum = getNum / 10;        // finding quotient of that number.
				store = store * 10 + rem;    // storing reverse number .
			}
			if(temp == store) {
				System.out.print(store + "  ");      // if revered number and temp number are equal then printing palindromic-prime numbers.
			}
			else {
				continue;
			}
		}
	}
	
	/*** Prime -Anagrams method ***/
	public static void primeAnagrams() {
		primeNumInRange();
		for(int i = 0; i < arrayList.size(); i++) {
			int getNum1 = arrayList.get(i);
			String NumToString1 = Integer.toString(getNum1);
			
			for(int j = i+1; j < arrayList.size(); j++) {
				int getNum2 = arrayList.get(j);
				String NumToString2 = Integer.toString(getNum2);
			
				if(NumToString1.length() == NumToString2.length()) {
					char[] array1 = NumToString1.toCharArray();
					char[] array2 = NumToString2.toCharArray();
					
					Arrays.sort(array1);
					Arrays.sort(array2);
					
				    boolean result = Arrays.equals(array1, array2);
				    
				    if(result) {
				    	System.out.println("\n" + NumToString1 + " <---> " + NumToString2);
				    }
				    else {
				    	continue;
				    }
				}
			}
		}
	}
	
	/*** Main Method ***/
	public static void main(String[] args) {
		System.out.println("-------------WELCOME TO PRIME-PALINDROME-ANAGRAM PROGRAM---------------\n");
		
		System.out.println("Palindromic prime numbers from 0 to 1000 :-  \n");
		PrimeAnagramAndPalindrome.palindromicPrimes();    
		
		System.out.println(" ");
		
		System.out.println("\nPrime and Anagram numbers from 0 to 1000 :-  ");
		PrimeAnagramAndPalindrome.primeAnagrams();
	}
}
