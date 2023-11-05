package home_week5;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Programme_6_Retrieve {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Specify the index from which to retrieve the element
        int indexToRetrieve = 2;

        // Check if the index is within the bounds of the ArrayList
        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
            String retrievedElement = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}

