package com.bridgelabz.day10;

public class MathFunction {

	public static void main(String args[]) {
		int array[] = new int[] { 5, 70, 2, 21, 68, 23, 9, 45 };
		int min = getMin(array);
		System.out.println("Minimum Value is: " + min);
		int max = getMax(array);
		System.out.println("Maximum Value is: " + max);
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
}