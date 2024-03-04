package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {

    public static void main(String[] args) {

        // Step One: Declare a Map
        Map<String, String> studentResults = new HashMap<String, String>();

        // Step Two: Add items to a Map
        studentResults.put("Prayash", "Passed");
        studentResults.put("Mark", "Failed");

        // Step Three: Loop through a Map
        for (Map.Entry<String, String> result : studentResults.entrySet()) {
            System.out.println(result.getKey() + " has " + result.getValue() + " the exam.");
        }

    }

}
