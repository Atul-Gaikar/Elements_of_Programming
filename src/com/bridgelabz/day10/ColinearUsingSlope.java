package com.bridgelabz.day10;

public class ColinearUsingSlope {
	public static void main(String args[]) {
		int x1 = 2, x2 = 4, x3 = 6, y1 = 4, y2 = 6, y3 = 8;

		collinear(x1, y1, x2, y2, x3, y3);

	}

	static void collinear(int x1, int y1, int x2, int y2, int x3, int y3) {

		int AB = (y2 - y1) / (x2 - x1);
		int BC = (y3 - y2) / (x3 - x2);
		int AC = (y3 - y1) / (x3 - x1);
		if (AB == AC && AB == BC && BC == AC)
			System.out.println("Its Colinear");
		else
			System.out.println("Its Not Colinear");
	}
}
