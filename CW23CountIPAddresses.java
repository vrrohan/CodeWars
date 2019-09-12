package com.ron.java;

import java.util.Arrays;

public class CW23CountIPAddresses {

	public static long ipsBetween(String start, String end) {
		// first create String array of binaries
		String[] binStartArray = Arrays.stream(start.split("\\.")).map(x -> Integer.toBinaryString(Integer.parseInt(x)))
				.toArray(String[]::new);
		String[] binEndArray = Arrays.stream(end.split("\\.")).map(x -> Integer.toBinaryString(Integer.parseInt(x)))
				.toArray(String[]::new);

		String binFirstIP = "";
		String binSecondIP = "";
		// then append 0 to string binaries
		for (int i = 0; i < binEndArray.length; i++) {
			String zeroToStart = new String(new char[8 - binStartArray[i].length()]).replace('\0', '0').toString();
			String zeroToEnd = new String(new char[8 - binEndArray[i].length()]).replace('\0', '0').toString();
			binFirstIP += zeroToStart + binStartArray[i];
			binSecondIP += zeroToEnd + binEndArray[i];
		}

		return (Long.parseLong(binSecondIP, 2) - Long.parseLong(binFirstIP, 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
	}
}
