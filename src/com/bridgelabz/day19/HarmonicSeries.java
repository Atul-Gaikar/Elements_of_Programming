package com.bridgelabz.day19;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = in.nextInt();
		getHarmonic(number);

	}

	public static void getHarmonic(int number) {
		double i, sum = 0.0;
		System.out.println("The Harmonic Series Is" + number + "=");
		for (i = 1; i <= number; i++) {
			sum = sum + 1 / i;

			System.out.print(sum + ", ");
		}
	}

}
