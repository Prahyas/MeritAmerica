package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {

	public static void main(String[] args) {

		// Step One: Declare a List
		ArrayList<String> names = new ArrayList<String>();

		// Step Two: Add values to a List
		names.add("Mark");
		names.add("Prayash");
		names.add("Adin");
		names.add("Monica");
		names.add("Ashmita");

		// Step Three: Looping through a List in a for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// Step Four: Remove an item
		names.remove(1);

		System.out.println(names);

		// Step Five: Looping through List in a for-each loop

		for (String mark : names) {
			System.out.println(mark);
		}

	}

}
