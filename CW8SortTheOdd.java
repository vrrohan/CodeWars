package com.ron.java;

public class CW8SortTheOdd {

	public static int[] sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[j] % 2 != 0) && (array[i] % 2 != 0) && array[j] < array[i]) {
					// swap the numbers
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			} // inner j loop...
		} // outer i loop...
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedOddArray = sortArray(new int[] { 5, 3, 2, 8, 1, 4 });
		for (int numb : sortedOddArray) {
			System.out.print(numb + " ");
		}

	}

}

/*
Best Practices:-

import java.util.*;

public class Kata {

  public static int[] sortArray(final int[] array) {

    // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
    
    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }
    
    return array;
  }
  
}

*/
