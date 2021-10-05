package com.bridgelabz.day11;

public class StdOut {
	public static void main(String[] args) {
		StdOut std = new StdOut();
		std.print("S");
		std.println("S \nA");
		std.println();
	}

	public void print(String s) {
		System.out.println(s);
	}

	public void println(String s) {
		System.out.println(s);
	}

	public void println() {
		System.out.println("A");
	}
}
