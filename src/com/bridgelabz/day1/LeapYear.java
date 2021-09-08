package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// year to be checked
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :- ");

		int year = Integer.parseInt(sc.nextLine());
		boolean leap = false;

		if (year >= 1582) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				leap = true;
			else
				leap = false;
		} else
			leap = false;

		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");

	}
}