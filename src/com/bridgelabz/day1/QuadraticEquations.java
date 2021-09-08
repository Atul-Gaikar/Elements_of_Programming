package com.bridgelabz.day1;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :-");
		double a = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the second value :-");
		double b = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the third value :-");
		double c = Double.parseDouble(sc.nextLine());

		double root1, root2;

		// calculate the determinant (b2 - 4ac)
		double determinant = b * b - 4 * a * c;

		// check if determinant is greater than 0
		if (determinant > 0) {

			// two real and distinct roots
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);

			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}

		// check if determinant is equal to 0
		else if (determinant == 0) {

			// two real and equal roots
			// determinant is equal to 0
			// so -b + 0 == -b
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}

		// if determinant is less than zero
		else {

			// roots are complex number and distinct
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}
}