package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" -> "Crash").
     *
     * The animal name should be case-insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "Herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * animalGroupName("giraffe") → "Tower"
     * animalGroupName("") → "unknown"
     * animalGroupName("walrus") → "unknown"
     * animalGroupName("Rhino") → "Crash"
     * animalGroupName("rhino") → "Crash"
     * animalGroupName("elephants") → "unknown"
     *
     */
    public String animalGroupName(String animalName) {

        if (animalName == null || animalName == "") {
            return "unknown";
        }

        Map<String, String> groupCollection = new HashMap<String, String>();
        groupCollection.put("Rhino", "Crash");
        groupCollection.put("Giraffe", "Tower");
        groupCollection.put("Elephant", "Herd");
        groupCollection.put("Lion", "Pride");
        groupCollection.put("Crow", "Murder");
        groupCollection.put("Pigeon", "Kit");
        groupCollection.put("Flamingo", "Pat");
        groupCollection.put("Deer", "Herd");
        groupCollection.put("Dog", "Pack");
        groupCollection.put("Crocodile", "Float");

        for (Map.Entry<String, String> eachAnimal : groupCollection.entrySet()) {

            if (eachAnimal.getKey().toLowerCase().equals(animalName.toLowerCase())) {
                return eachAnimal.getValue();
            }

        }

        return "unknown";
    }

    /*
     * Given a String item number (a.k.a. SKU), return the discount percentage if
     * the item is on sale.
     * If the item is not on sale, return 0.00.
     *
     * If the item number is empty or null, return 0.00.
     *
     * "KITCHEN4001" -> 0.20
     * "GARAGE1070" -> 0.15
     * "LIVINGROOM" -> 0.10
     * "KITCHEN6073" -> 0.40
     * "BEDROOM3434" -> 0.60
     * "BATH0073" -> 0.15
     *
     * The item number should be case-insensitive so "kitchen4001", "Kitchen4001",
     * and "KITCHEN4001"
     * should all return 0.20.
     *
     * isItOnSale("kitchen4001") → 0.20
     * isItOnSale("") → 0.00
     * isItOnSale("GARAGE1070") → 0.15
     * isItOnSale("spaceship9999") → 0.00
     *
     */
    public double isItOnSale(String itemNumber) {
        if (itemNumber == null || itemNumber.isEmpty()) {
            return 0.00;
        }

        Map<String, Double> itemDiscountList = new HashMap<String, Double>();
        itemDiscountList.put("KITCHEN4001", 0.20);
        itemDiscountList.put("GARAGE1070", 0.15);
        itemDiscountList.put("LIVINGROOM", 0.10);
        itemDiscountList.put("KITCHEN6073", 0.40);
        itemDiscountList.put("BEDROOM3434", 0.60);
        itemDiscountList.put("BATH0073", 0.15);

        for (Map.Entry<String, Double> discountCodes : itemDiscountList.entrySet()) {
            if (discountCodes.getKey().toLowerCase().equals(itemNumber.toLowerCase())) {
                return discountCodes.getValue();
            }
        }

        return 0.00;
    }

    /*
     * Modify and return the given Map as follows: if "Peter" has more than 0 money,
     * transfer half of it to "Paul",
     * but only if Paul has less than $10.
     *
     * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100,
     * ... $10=1000, ...
     *
     * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul":
     * 1099}
     * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul":
     * 30000}
     * robPeterToPayPaul({"Peter": 101, "Paul": 500}) → {"Peter": 51, "Paul": 550}
     * robPeterToPayPaul({"Peter": 0, "Paul": 500}) → {"Peter": 0, "Paul": 500}
     *
     */
    public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
        int peterMoney = peterPaul.get("Peter");
        int paulMoney = peterPaul.get("Paul");
        if (peterMoney > 0 && paulMoney < 1000) {
            int transferMoney = peterMoney / 2;
            peterPaul.put("Peter", peterMoney - transferMoney);
            peterPaul.put("Peter", peterMoney - transferMoney);
            peterPaul.put("Paul", paulMoney + transferMoney);
            return peterPaul;
        } else {
            return peterPaul;
        }
    }

    /*
     * Modify and return the given Map as follows: if "Peter" has $50 or more, AND
     * "Paul" has $100 or more,
     * then create a new "PeterPaulPartnership" worth a combined contribution of a
     * quarter of each partner's
     * current worth.
     *
     * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500,
     * "Paul": 75000, "PeterPaulPartnership": 37500}
     * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333,
     * "Paul": 1234567890}
     *
     */
    public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
        int peterMoney = peterPaul.get("Peter");
        int paulMoney = peterPaul.get("Paul");
        if (peterMoney >= 5000 && paulMoney >= 10000) {
            peterPaul.put("Peter", (int) (peterMoney * (1 - 0.25)));
            peterPaul.put("Paul", (int) (paulMoney * (1 - 0.25)));
            peterPaul.put("PeterPaulPartnership", (int) ((peterMoney * 0.25) + (paulMoney * 0.25)));
            return peterPaul;
        } else {
            return peterPaul;
        }
    }

    /*
     * Given an array of non-empty strings, return a Map<String, String> where, for
     * every String in the array,
     * there is an entry whose key is the first character of the string.
     *
     * The value of the entry is the last character of the String. If multiple
     * Strings start with the same letter, then the
     * value for that key should be the later String's last character.
     *
     * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
     * beginningAndEnding(["code", "bug", "cat"]) → {"b": "g", "c": "t"}
     * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d",
     * "m": "t", "n": "t"}
     */
    public Map<String, String> beginningAndEnding(String[] words) {
        Map<String, String> firstLastCharacterArray = new HashMap<String, String>();

        for (String word : words) {
            String firstCharacter = String.valueOf(word.charAt(0));
            String lastCharacter = String.valueOf(word.charAt(word.length() - 1));
            firstLastCharacterArray.put(firstCharacter, lastCharacter);
        }
        return firstLastCharacterArray;
    }

    /*
     * Given an array of Strings, return a Map<String, Integer> with a key for each
     * different String, with the value the
     * number of times that String appears in the array.
     *
     * ** A CLASSIC **
     *
     * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1
     * }
     * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
     * wordCount([]) → {}
     * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
     *
     */
    public Map<String, Integer> wordCount(String[] words) {
        Map<String, Integer> wordCountArray = new HashMap<String, Integer>();
        if (words.length == 0) {
            return wordCountArray;
        }

        for (String word : words) {
            if (wordCountArray.containsKey(word)) {
                wordCountArray.put(word, wordCountArray.get(word) + 1);
            } else {
                wordCountArray.put(word, 1);
            }
        }
        return wordCountArray;

    }

    /*
     * Given an array of int values, return a Map<Integer, Integer> with a key for
     * each int, with the value the
     * number of times that int appears in the array.
     *
     * ** The lesser known cousin of the classic wordCount **
     *
     * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63:
     * 3, 77: 1, 99:2}
     * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
     * intCount([]) → {}
     *
     */
    public Map<Integer, Integer> integerCount(int[] ints) {
        Map<Integer, Integer> intCountArray = new HashMap<>();

        for (int num : ints) {
            if (intCountArray.containsKey(num)) {
                intCountArray.put(num, intCountArray.get(num) + 1);
            } else {
                intCountArray.put(num, 1);
            }
        }
        return intCountArray;
    }

    /*
     * Given an array of Strings, return a Map<String, Boolean> where each different
     * String is a key and value
     * is true only if that String appears 2 or more times in the array.
     *
     * wordMultiple(["apple", "banana", "apple", "carrot", "banana"]) → {"banana":
     * true, "carrot": false, "apple": true}
     * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
     * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     *
     */
    public Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> wordCountArray = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String word : words) {
            // Increment the count for the word
            if (wordCountArray.containsKey(word)) {
                wordCountArray.put(word, wordCountArray.get(word) + 1);
            } else {
                wordCountArray.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountArray.entrySet()) {
            // Set the value to true if the word appears 2 or more times
            if (entry.getValue() >= 2) {
                result.put(entry.getKey(), true);
            } else {
                result.put(entry.getKey(), false);
            }
        }
        return result;
    }

    /*
     * Given two Maps, Map<String, Integer>, merge the two into a new Map,
     * Map<String, Integer> where keys in Map2,
     * and their int values, are added to the int values of matching keys in Map1.
     * Return the new Map.
     *
     * Unmatched keys and their int values in Map2 are simply added to Map1.
     *
     * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11,
     * "SKU4": 5})
     * → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
     *
     */
    public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
            Map<String, Integer> remoteWarehouse) {
        Map<String, Integer> result = new HashMap<>(mainWarehouse);

        for (Map.Entry<String, Integer> entry : remoteWarehouse.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (result.containsKey(key)) {
                // Add the value to the existing value in the result Map
                result.put(key, result.get(key) + value);
            } else {
                // If the key is not present, add it to the result Map with the value
                result.put(key, value);
            }
        }

        return result;

    }

    /*
     * Just when you thought it was safe to get back in the water ---
     * last2Revisited!!!!
     *
     * Given an array of Strings, for each String, its last2 count is the number of
     * times that a subString length 2
     * appears in the String and also as the last 2 chars of the String.
     *
     * We don't count the end subString, so "hixxxhi" has a last2 count of 1, but
     * the subString may overlap a prior
     * position by one. For instance, "xxxx" has a count of 2: one pair at position
     * 0, and the second at position 1.
     * The third pair at position 2 is the end subString, which we don't count.
     *
     * Return a Map<String, Integer> where the keys are the Strings from the array
     * and the values are the last2 counts.
     *
     * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1,
     * "xaxxaxaxx": 1, "axxxaaxx": 2}
     *
     */
    public Map<String, Integer> last2Revisited(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (word.length() < 2) {
                continue; // Skip words with less than 2 characters with continue
            }
            int count = 0;
            String lastTwoChars = word.substring(word.length() - 2);
            for (int i = 0; i < word.length() - 2; i++) { // Iterate only up to the second last character
                String pair = word.substring(i, i + 2);
                if (pair.equals(lastTwoChars)) {
                    count++;
                }
            }
            result.put(word, count);
        }
        return result;
    }

}
