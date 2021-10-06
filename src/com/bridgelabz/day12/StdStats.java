package com.bridgelabz.day12;

public class StdStats {
	public static void main(String[] args) {
		StdStats obj = new StdStats();
		double[] arr = { 20.34, 34.56, 23.45, 68.34 };
		System.out.println(obj.getCount(arr));
		System.out.println(obj.getMax(arr));
		System.out.println(obj.getMin(arr));
		System.out.println(obj.getSum(arr));
		System.out.println(obj.getMean(arr));
	}

	private int count;
	private double sum;
	private double mean;
	private double max;
	private double min;

	public int getCount(double[] arr) {
		return arr.length;

	}

	public double getSum(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[1];
		}
		return sum;
	}

	public double getMean(double[] arr) {
		double mean=sum/count;
		
		return sum / count;
	}

	public double getMin(double[] arr) {
		double min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public double getMax(double[] arr) {
		double max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}