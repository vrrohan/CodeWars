package com.ron.java;

import java.util.ArrayList;
import java.util.List;

public class CW24GapInPrimes {

	public static boolean isPrimeNumber(long num) {
		boolean flagForPrime = true;
		for (long i = 2; i <= Math.sqrt(num) + 1; i++) {
			if (num % i == 0) {
				flagForPrime = false;
				break;
			}
		}
		return flagForPrime;
	}

	public static long[] gap(int g, long m, long n) {
		if (n == m || (n - m) < g) {
			return null;
		} else {
			List<Long> lis = new ArrayList<Long>();
			for (long i = m; i <= n; i++) {
				if (isPrimeNumber(i)) {
					lis.add(i);
				}
			} // for loop ends...

			long p1 = -1, p2 = -1;
			for (int k = 0; k < lis.size() - 1; k++) {
				if (lis.get(k + 1) - lis.get(k) == g) {
					p1 = lis.get(k);
					p2 = lis.get(k + 1);
					break;
				}
			} // for ends...
			return (p1 == -1 && p2 == -1) ? null : new long[] { p1, p2 };
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] primes = gap(10, 300, 400);
		if (primes != null) {
			for (long l : primes) {
				System.out.print(l + " ");
			}
		} else {
			System.out.println("null");
		}
	}

}
