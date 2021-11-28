package com.algorithm.problems;

public class PrimeNumbersInRange {

	/***  Prime numbers computation from 0 to 1000 ***/
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
					System.out.print(index + "  ");      // printing the prime numbers.
				}
		}
	}
	/*** Main Method ***/
	public static void main(String[] args) {
		/*** Displaying welcome message ***/
		System.out.println("------------------------------Prime Numbers In range (0 to 1000)------------------------------------\n\n");
		
		System.out.println("Prime numbers from 0 to 1000 :-  \n");
		PrimeNumbersInRange.primeNumInRange();        // calling static method primeNumInRange() 
	}
}
