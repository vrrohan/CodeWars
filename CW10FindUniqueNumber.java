package com.ron.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CW10FindUniqueNumber {

	public static double findUniq(double[] arr) {
		double[] dist = Arrays.stream(arr).distinct().toArray();
		List<Double> coll = Arrays.stream(arr).boxed().collect(Collectors.toList());
		double distinctNumber = 0.0;
		for (int i = 0; i < dist.length; i++) {
			if (coll.indexOf(dist[i]) == coll.lastIndexOf(dist[i])) {
				distinctNumber = dist[i];
				break;
			}
		}
		return distinctNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findUniq(new double[] { 0, 0, 0, 0.55, 0, 0, 0, 0, 0 }));
	}

}

/*
Best Practices:-

import java.util.Arrays;
 public class Kata {
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}

*/