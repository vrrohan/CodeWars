package com.ron.java;

import java.util.stream.IntStream;

public class CW16LostWithoutMaps {

	public static int[] map(int[] arr) {
		return IntStream.of(arr).boxed().mapToInt(x -> x * 2).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = map(new int[] { 1, 4, 3, 2 });
		for (int i : d) {
			System.out.print(i + " ");
		}
	}

}
