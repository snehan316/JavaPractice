package com.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] myIntegers = SortNumbers.getIntegers(5);
//		int[] sorted = SortNumbers.sortArray(myIntegers);
//		SortNumbers.printArray(sorted);
		
//		int minNum = MinInteger.minNumber(myIntegers);
//		System.out.println("Minimun integer is " + minNum);
		SortNumbers.printArray(myIntegers);
		int[] reversed = ReverseArray.reverseArray(myIntegers);
		SortNumbers.printArray(reversed);
	

	}
	
	
}
