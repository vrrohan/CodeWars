package com.ron.java;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CW7AreTheySame {

	public static boolean comp(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0) {
			return true;
		} else if (a == null || b == null) {
			return false;
		} else {
			List<Integer> arrayOne = IntStream.of(a).boxed().collect(Collectors.toList());
			List<Integer> arrayTwo = IntStream.of(b).boxed().collect(Collectors.toList());
			Collections.sort(arrayOne);
			Collections.sort(arrayTwo);
			boolean areArrayEqual = true;
			for (int i = 0; i < arrayOne.size(); i++) {
				System.out.println(arrayOne.get(i) * arrayOne.get(i) + ", " + arrayTwo.get(i));
				if (arrayOne.get(i) * arrayOne.get(i) != arrayTwo.get(i)) {
					areArrayEqual = false;
					break;
				}
			}
			return areArrayEqual;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comp(new int[] { 0, -14, 191, 161, 19, 144, 195, 1 },
				new int[] { 1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195 }));

	}

}
