package com.practice;

import java.util.Scanner;

public class MinInteger {

	public static int[] getIntegers(int count) {
		Scanner scanner =  new Scanner(System.in);
		int[] array = new int[count];
		System.out.println("Enter " + count + " integer values: ");
		for(int i=0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		return array;
	}
	
	public static int minNumber(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
}
