package home_week5;

/**
 * Declare following two arrylist and compare it.
 */

import java.util.ArrayList;

public class Programme_11_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Pink");
        c1.add("Green");
        c1.add("Black");
        c1.add("Orange");
        c1.add("Red");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Pink");
        c2.add("Green");
        c2.add("Black");
        c2.add("Red");

        // Compare the ArrayLists
        boolean areEqual = c1.equals(c2);

        if (areEqual) {
            System.out.println("c1 and c2 are equal.");
        } else {
            System.out.println("c1 and c2 are not equal.");
        }
    }
}

