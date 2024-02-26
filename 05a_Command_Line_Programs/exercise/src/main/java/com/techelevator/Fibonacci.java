package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int fiboEndNum = scanner.nextInt();

		int firstTerm = 0;
		int secondTerm = 1;

		while (firstTerm <= fiboEndNum) {
			System.out.println(firstTerm + ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
