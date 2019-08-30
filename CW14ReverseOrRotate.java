package com.ron.java;

public class CW14ReverseOrRotate {

	public static String revRot(String strng, int sz) {
		String modifiedChunks = "";
		int chunkSize = 0;
		if (sz <= 0 || strng.trim().length() == 0 || sz > strng.length()) {
			return "";
		} else {
			for (int i = 0; i < strng.length() / sz; i++) {
				// create chunk of size sz from string
				String trimmedChunk = strng.substring(chunkSize, sz + chunkSize);
				int sumOfCubes = 0;
				// now process each chunk
				for (int j = 0; j < trimmedChunk.length(); j++) {
					// take each digit from that chunk one by one
					int numCube = Integer.parseInt(String.valueOf(trimmedChunk.charAt(j)));
					// cube it by 3 & add it to sum
					sumOfCubes += Math.pow(numCube, 3);
				}
				// now check if sum of cubes is divisible by 2 or not
				if (sumOfCubes % 2 == 0) {
					modifiedChunks += new StringBuilder(trimmedChunk).reverse().toString();
				} else {
					// else rotate chunk to one position by left
					modifiedChunks += trimmedChunk.substring(1) + String.valueOf(trimmedChunk.charAt(0));
				}
				chunkSize += sz;
			} // end of outer for loop...
			return modifiedChunks;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revRot("123456779", 8));
	}

}
