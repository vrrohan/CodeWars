package com.ron.java;

import java.util.List;

public class CW26CaesarCipher {

	public static List<String> movingShift(String s, int shift) {
		String encodedString = "";
		for (int i = 0; i < s.length(); i++) {
			int charToEncode = (int) s.charAt(i);
			if (charToEncode >= 97 && charToEncode <= 122) {
				int toEncode = ((123-charToEncode) + shift) % 26;
				encodedString += (char)toEncode;
			} else if (charToEncode >= 65 && charToEncode <= 90) {
				int toEncode = ((90-charToEncode) + shift) % 26;
				encodedString += (char)toEncode;
			} else {
				encodedString += s.charAt(i); 
			}
			shift++;
		} // for loop ends...
		System.out.println(encodedString);
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String u = "I should have known that you would have a perfect answer for me!!!";
		System.out.println(movingShift(u, 1));
	}

}
