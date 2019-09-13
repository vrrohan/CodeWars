package com.ron.java;

import java.util.ArrayList;

public class CW27RailFenceCipher {

	public static String encode(String s, int n) {
		String encodedString = "";
		ArrayList<String> enc = new ArrayList<String>();
		int br = (n * 2) - 2;
		for (int i = 0; i < s.length(); i += br) {
			if ((i + br) >= s.length()) {
				enc.add(s.substring(i, s.length()));
			} else {
				enc.add(s.substring(i, i + br));
			}
		}
		// to encode first line
		for (int j = 0; j < enc.size(); j++) {
			encodedString += enc.get(j).charAt(0);
		}
		System.out.println(encodedString);

		// to encode rest line
		int line1 = 1;
		while (line1 < enc.get(0).length()/2) {
			String str = "";
			for (int k = 0; k < enc.size(); k++) {
				//last string in list) {
				int line2 = enc.get(k).length() - line1;
				if(k==enc.size()-1) {
					
				} else {
					str += enc.get(k).charAt(line1) + enc.get(k).charAt(line2);
					
				}
			}
			System.out.println("mid lines : " + str);
			encodedString += str;
			++line1;
		}

		System.out.println(encodedString);
		//to encode last line
		for (int j = 0; j < enc.size(); j++) {
			encodedString += enc.get(j).charAt(line1);
		}
		
		System.out.println(encodedString);
		return null;
	}

	public static String decode(String s, int n) {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "attackatdawncipher";
		System.out.println(encode(s, 3));
	}

}
