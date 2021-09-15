package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter first number:");
		int x = Integer.parseInt(myObj.nextLine());

		System.out.println("Enter second number:");
		int y = Integer.parseInt(myObj.nextLine());

		double distance = Math.sqrt(x * x + y * y);
		System.out.println(distance);
	}
}
