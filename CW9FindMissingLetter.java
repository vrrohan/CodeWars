package com.ron.java;

public class CW9FindMissingLetter {

	public static char findMissingLetter(char[] array) {
		int missingAscii = (int) array[0];
		for (int i = 1; i < array.length; i++) {
			if (missingAscii + 1 != (int) array[i]) {
				break;
			} else {
				missingAscii++;
			}
		}
		return (char) ++missingAscii;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMissingLetter(new char[] { 'O', 'Q', 'R', 'S' }));
	}

}
