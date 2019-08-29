package com.ron.java;

public class CW4WhoLikesIt {

	public static String whoLikesIt(String... names) {
		return (names.length == 0) ? "no one likes this"
				: (names.length == 1) ? names[0] + " likes this"
						: (names.length == 2) ? names[0] + " and " + names[1] + " like this"
								: (names.length == 3) ? names[0] + ", " + names[1] + " and " + names[2] + " like this"
										: names[0] + ", " + names[1] + " and " + (names.length - 2)
												+ " others like this";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(whoLikesIt(new String[] { "Alex", "Peter", "Susy", "Mark", "Bill" }));
	}

}

/*
 * Best Practices:-
 * 
 * class Solution { public static String whoLikesIt(String... names) { switch
 * (names.length) { case 0: return "no one likes this"; case 1: return
 * String.format("%s likes this", names[0]); case 2: return
 * String.format("%s and %s like this", names[0], names[1]); case 3: return
 * String.format("%s, %s and %s like this", names[0], names[1], names[2]);
 * default: return String.format("%s, %s and %d others like this", names[0],
 * names[1], names.length - 2); } } }
 * 
 */
