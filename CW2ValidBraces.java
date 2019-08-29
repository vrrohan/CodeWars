package com.ron.java;

import java.util.Stack;

public class CW2ValidBraces {

	public static boolean isValid(String braces) {
		Stack<Character> validBraces = new Stack<Character>();
		boolean isBracesLeft = false;
		for (int i = 0; i < braces.length(); i++) {
			if (braces.charAt(i) == '{' || braces.charAt(i) == '[' || braces.charAt(i) == '(') {
				validBraces.push(braces.charAt(i));
			} else if (braces.charAt(i) == '}' && !validBraces.isEmpty() && validBraces.peek() == '{') {
				validBraces.pop();
			} else if (braces.charAt(i) == ']' && !validBraces.isEmpty() && validBraces.peek() == '[') {
				validBraces.pop();
			} else if (braces.charAt(i) == ')' && !validBraces.isEmpty() && validBraces.peek() == '(') {
				validBraces.pop();
			} else {
				isBracesLeft = true;
				break;
			}
		}
		return (validBraces.size() > 0 || isBracesLeft) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{}}}"));
	}

}
