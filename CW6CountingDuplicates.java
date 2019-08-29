package com.ron.java;

import java.util.HashMap;
import java.util.Map;

public class CW6CountingDuplicates {

	public static int duplicateCount(String text) {
		int duplicateCount = 0;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < text.length(); i++) {
			String chr = String.valueOf(text.charAt(i)).toLowerCase();
			if (hm.containsKey(chr)) {
				hm.put(chr, hm.get(chr) + 1);
			} else {
				hm.put(chr, 1);
			}
		}

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			if (e.getValue() > 1) {
				duplicateCount++;
			}
		}

		return duplicateCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(duplicateCount("abccDefFFfghg"));
	}

}
