package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the length:");

		int length = scanner.nextInt();

		System.out.println("Is the measurement in (m)eters, or (f)eet?");

		String typeOfLength = scanner.next();

		if (typeOfLength.equalsIgnoreCase("M")) {

			// f = m * 3.2808399
			final double TO_FEET = 3.2808399;
			int lengthFeet = (int) Math.floor(length * TO_FEET);

			System.out.println(length + typeOfLength + "is " + lengthFeet + "F");

		} else if (typeOfLength.equalsIgnoreCase("F")) {
			// m = f * 0.3048

			final double TO_METERS = 0.3048;
			int lengthMeters = (int) Math.floor(length * TO_METERS);

			System.out.println(length + typeOfLength + "is " + lengthMeters + "M");

		} else {
			System.out.println("Invalid input");
		}

	}

}
