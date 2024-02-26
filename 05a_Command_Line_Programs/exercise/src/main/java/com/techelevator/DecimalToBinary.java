package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values");
		String seriesOfNums = scanner.nextLine();

		String[] numsArray = seriesOfNums.split(" ");

		System.out.println(Arrays.toString(numsArray));

		// String[] newBinaryArray = new String[numsArray.length];
		for (int i = 0; i < numsArray.length; i++) {
			int eachNumber = Integer.parseInt(numsArray[i]);
			String binaryString = "";
			while (eachNumber != 0) {
				int remainder = eachNumber % 2;
				binaryString = remainder + binaryString;
				eachNumber = eachNumber / 2;
			}

			// newBinaryArray[i] = binaryString;

			System.out.println(numsArray[i] + " in binary is " + binaryString);

		}
		// System.out.println(Arrays.toString(newBinaryArray));

	}

}