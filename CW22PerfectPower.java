package com.ron.java;

public class CW22PerfectPower {

	public static int[] isPerfectPower(int n) {
		int m = -1, k = -1;
		boolean isFound = false;
		for (int i = 2; i <= Math.round(Math.sqrt(n)); i++) {
			for (int j = 2; j <= Math.round(Math.log(n)) + 5; j++) {
				if (Math.pow(i, j) == n) {
					m = i;
					k = j;
					isFound = true;
					break;
				}
			}
			if (isFound) {
				break;
			}
		}
		return (m == -1 && k == -1) ? null : new int[] { m, k };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 500; i++) {
			int[] arr = isPerfectPower(i);
			if (arr != null) {
				for (int num : arr) {
					System.out.print(num + " ");
				}
				System.out.println(" : " + i);
			}
		}

	}
}

// Clever Solution :-

// public class PerfectPower {
// public static int[] isPerfectPower(int n) {
// for (int i = 2; ; i++) {
// int root = (int) Math.round(Math.pow(n, 1.0 / i));
// if (root < 2) return null;
// if (Math.pow(root, i) == n) return new int[]{root, i};
// }
// }
// }
