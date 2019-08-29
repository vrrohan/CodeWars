package com.ron.java;

import java.util.StringJoiner;

public class CW1Mumbling {

	public static String accum(String s) {
		StringJoiner sj = new StringJoiner("-");
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			String mumbledString = String.valueOf(s.charAt(i));
			for (int j = 0; j < i; j++) {
				mumbledString += String.valueOf(s.charAt(i)).toLowerCase();
			}
			sj.add(mumbledString);
		}
		return sj.toString();
	}

	public static void main(String[] args) {
		System.out.println(accum("RqaEzty"));
	}
}
