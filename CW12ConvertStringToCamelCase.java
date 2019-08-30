package com.ron.java;

public class CW12ConvertStringToCamelCase {

	public static String toCamelCase(String s) {
		String[] words = s.trim().split("[-_]");
		String camelCaseWord = words[0];
		for (int i = 1; i < words.length && s.length() > 0; i++) {
			camelCaseWord += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
		}
		return (s.length() == 0) ? "" : camelCaseWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toCamelCase("The_Stealth_Warrior"));
	}

}
