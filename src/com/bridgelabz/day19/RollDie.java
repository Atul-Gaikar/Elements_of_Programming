package com.bridgelabz.day19;

import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of possibilities to roll the die:");
		int n = sc.nextInt();

		int min = 1;
		int max = 6;
		System.out.println("Random value in int upto " + n + " is :");

		int count = 1;
		for (int i = 1; i <= n; i++) {
			int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
			if (random_int == i) {
				count++;
			}
			System.out.println(random_int + " is Reapeated " + count + "Times");

		}
	}
}