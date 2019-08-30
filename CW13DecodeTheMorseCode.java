package com.ron.java;

import java.util.HashMap;
import java.util.StringJoiner;

public class CW13DecodeTheMorseCode {

	public static String decode(String morseCode) {
		StringJoiner morseCodeJoiner = new StringJoiner(" ");
		HashMap<String, String> morseMap = new HashMap<String, String>();
		String[] encodedMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
		String[] morseCharacters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		for (int i = 0; i < encodedMorse.length; i++) {
			morseMap.put(encodedMorse[i], morseCharacters[i]);
		}
		String[] morseInputCode = morseCode.trim().split("(\\s\\s\\s)");
		for (String morseWords : morseInputCode) {
			String[] morseChars = morseWords.split("\\s+");
			String morseWord = "";
			for (String c : morseChars) {
				morseWord += morseMap.get(c);
			}
			morseCodeJoiner.add(morseWord);
		}
		return morseCodeJoiner.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decode(".... . -.--   .--- ..- -.. ."));
	}

}
