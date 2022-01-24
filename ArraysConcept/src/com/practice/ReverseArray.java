package com.practice;

public class ReverseArray {

	public static int[] reverseArray(int[] array) {
		int mid = (array.length - 0)/2;
		for(int i = 0; i <= mid; i++ ) {
			int temp = array[i];
			array[i] = array[array.length - (i+1)];
			array[array.length - (i+1)] = temp;
		}
		
		return array;
	}
}
