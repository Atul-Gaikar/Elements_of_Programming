package com.bridgelabz.day17;

import java.util.Scanner;

public class PrimePalindrome {
	public static void main(String[] args) {
		PrimePalindrome p = new PrimePalindrome();
		p.accept();
		p.primePalin();
	}

	int m, n, rev, c;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial number: ");
		m = sc.nextInt();
		System.out.println("Enter the last number: ");
		n = sc.nextInt();
	}

	void primePalin() {
		int num, temp, i;
		System.out.println("The prime palindrome number are : ");
		for (num = m; num <= n; num++) {
			c = 0;
			rev = 0;
			temp = num;
			for (i = 1; i <= temp; i++) {
				if (temp % i == 0)
					c++;
			}
			if (c == 2) {

				while (temp > 0) {
					rev = rev * 10 + (temp % 10);
					temp = temp / 10;
				}
				if (rev == num)
					System.out.println(num + " ");
			}
		}
	}
}
