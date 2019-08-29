package com.ron.java;

public class CW3YouAreASquare {

	public static boolean isSquare(int n) {
		String[] numberDecimal = String.valueOf(Math.sqrt(n)).split("\\.");
		return (n < 0) ? false : (numberDecimal[1].length() > 1) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSquare(2));
	}

}

/*
 * Best Practices 1:-

import static java.lang.Math.*;
public class Square {    
    public static boolean isSquare(int n) {      
        return Math.sqrt(n) % 1 == 0;
    }
}

*  
*/

/*
 * Best Practices 2:-

public class Square {
    public static boolean isSquare(int n) {
        long s = Math.round(Math.sqrt(n));
        return s * s == n;
    }
}

*/
