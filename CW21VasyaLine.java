package com.ron.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CW21VasyaLine {

	public static String Tickets(int[] peopleInLine) {
		List<Integer> t = new ArrayList<Integer>();
		String ticketStatus = "YES";
		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == 25) {
				t.add(peopleInLine[i]);
			} else if (peopleInLine[i] == 50 && t.contains(25)) {
				// check it 25 dollars present in list or not
				t.remove(t.indexOf(25));
				t.add(peopleInLine[i]);
			} else if (peopleInLine[i] == 100 && t.contains(25)) {
				int tf = Collections.frequency(t, 25);
				int fif = Collections.frequency(t, 50);
				if (tf >= 3 && fif == 0) {
					t.remove(t.indexOf(25));
					t.remove(t.indexOf(25));
					t.remove(t.indexOf(25));
				} else if (tf >= 1 && fif == 1) {
					t.remove(t.indexOf(25));
					t.remove(t.indexOf(50));
				} else {
					ticketStatus = "NO";
				}
			} else {
				ticketStatus = "NO";
			}
		}
		return ticketStatus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Tickets(new int[] { 25, 25, 25, 25, 25, 50, 100, 50 }));
	}

}
