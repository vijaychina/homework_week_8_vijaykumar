package home_week5;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {

    public static void main(String[] args) {
        // Create a HashMap to store names (String) as keys and ages (Integer) as values
        Map<String, Integer> people = new HashMap<>();

        // Add some entries to the HashMap
        people.put("Ajay", 15);
        people.put("Boni", 50);
        people.put("Chiman", 25);
        people.put("Dharmendra", 30);

        // Iterate through the values using a for-each loop
        System.out.println("Ages of people in the HashMap:");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }
}

