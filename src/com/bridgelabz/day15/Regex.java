package com.bridgelabz.day15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		First(SC);
		Last(SC);
		Email(SC);
		Mobile(SC);
		Password(SC);
		Date(SC);

	}

	public static boolean First(Scanner SC) {
		String i;
		System.out.println("Enter Your First Name :-");
		i = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3}$");// Regex sintax
		Matcher matcher = pattern.matcher(i);// Regex sintax

		boolean matchFound = matcher.matches();// Use for identification of correct or incorrect.
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Incorrect");
		}
		return matchFound;
	}

	public static boolean Last(Scanner SC) {
		String j;
		System.out.println("Enter Your Last Name :-");
		j = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{5}$");
		Matcher matcher = pattern.matcher(j);
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Incorrect");
		}
		return matchFound;
	}

	public static boolean Email(Scanner SC) {
		String k;
		System.out.println("Enter Your Email ID :-");
		k = SC.next();
		Pattern pattern = Pattern.compile("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(k);

		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Email address is Correct");
		} else {
			System.out.println("Email address is Incorrect");
		}
		return matchFound;
	}

	public static boolean Mobile(Scanner SC) {
		String l;
		System.out.println("Enter Your Mobile Number :-");
		l = SC.next();
		Pattern pattern = Pattern.compile("^[7-9][0-9]{9}$");
		Matcher matcher = pattern.matcher(l);

		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("Mobile Number is Correct");
		} else {
			System.out.println("Mobile Number is Incorrect");
		}
		return matchFound;
	}

	public static boolean Password(Scanner SC) {
		String m;
		System.out.println("Enter Your Password :-");
		m = SC.next();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.@-]{8}+$");
		Matcher matcher = pattern.matcher(m);

		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("The password is Correct");
		} else {
			System.out.println("The password is Incorrect");
		}
		System.out.println();

		return matchFound;
	}

	public static boolean Date(Scanner SC) {
		String n;
		System.out.println("Enter Your Date :-");
		n = SC.next();
		Pattern pattern = Pattern.compile("[0-9]{1,2}(/|-)[0-9]{1,2}(/|-)[0-9]{4}");
		Matcher matcher = pattern.matcher(n);

		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("The date is Correct");
		} else {
			System.out.println("The date is Incorrect");
		}
		System.out.println();

		return matchFound;
	}
}