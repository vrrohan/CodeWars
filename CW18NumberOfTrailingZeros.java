package com.ron.java;

public class CW18NumberOfTrailingZeros {

	public static int zeros(int n) {
		int trailZeros = 0, max = 1;
		while (n / Math.pow(5, max) >= 1) {
			trailZeros += n / Math.pow(5, max);
			max++;
		}
		return (n == 0) ? 0 : trailZeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zeros(4617));
	}

}
