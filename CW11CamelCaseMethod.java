package com.ron.java;

public class CW11CamelCaseMethod {

	public static String camelCase(String str) {
		String[] words = str.trim().split("\\s+");
		String camelCaseWord = "";
		for (int i = 0; i < words.length && str.length() != 0; i++) {
			camelCaseWord += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
		}
		return (str.length() == 0) ? "" : camelCaseWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(camelCase(""));
	}

}
