package com.ron.java;

import java.util.regex.Pattern;

public class CW25BinaryRegexp {

	public static Pattern multipleOf3() {
		return Pattern.compile("(1(01*0)*1|0)*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mul = { "000", "011", "110", "1001", "1100", "1111", "1000", " abc " };
		for (String m : mul) {
			System.out.println(multipleOf3().matcher(m).matches());
		}
	}

}
