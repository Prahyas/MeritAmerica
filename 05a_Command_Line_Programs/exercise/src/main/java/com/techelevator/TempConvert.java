package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the temperature:");

		int temp = scanner.nextInt();

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");

		String typeOfTemp = scanner.next();

		if (typeOfTemp.equalsIgnoreCase("F")) {

			// temperatureCelsius = (temperatureFahrenheit - 32) / 1.8

			int tempCelsius = (int) Math.floor((temp - 32) / 1.8);

			System.out.println(temp + typeOfTemp + "is " + tempCelsius + "C");

		} else if (typeOfTemp.equalsIgnoreCase("C")) {
			// temperatureFahrenheit = temperatureCelsius * 1.8 + 32
			int tempFahrenheit = (int) Math.floor(temp * 1.8 + 32);
			System.out.println(temp + typeOfTemp + " is " + tempFahrenheit + "F");

		} else {
			System.out.println("Invalid input");
		}

	}

}
