package com.ron.java;

public class CW5SumOfNumbers {

	public static int GetSum(int a, int b) {
		if (a == b) {
			return a;
		} else {
			int d = 1;
			if (a > b) {
				d = -1;
			}
			int n = (Math.max(a, b) - Math.min(a, b)) + 1;
			return ((n * a) + ((n * n * d - n * d) / 2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetSum(-1, 2));
	}

}

/*
Better Solution:-

public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
}

*/