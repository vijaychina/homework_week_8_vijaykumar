package home_week5;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
import java.util.HashSet;


public class Programme_8_Integer {

    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers in the set: " + numberSet);

        System.out.print("Numbers between 1 and 10 in the set: ");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.print(i + " ");
            } else {

                System.out.print(i + " (not in the set) ");
            }
        }
    }
}



