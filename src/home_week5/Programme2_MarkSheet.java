package home_week5;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

import java.util.Scanner;

public class Programme2_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueAdding = 'Y';

        while (continueAdding == 'Y' || continueAdding == 'y') {
            System.out.print("Enter Student Name\t\t\t:\t");
            String name = scanner.next();
            System.out.print("Enter Student Roll Number\t:\t");
            int rollNum = scanner.nextInt();
            int mathsMarks, scienceMarks, englishMarks;

            do {
                System.out.print("Enter Marks of Subject Maths\t:\t");
                mathsMarks = scanner.nextInt();
                if (mathsMarks < 0 || mathsMarks > 100) {
                    System.out.println("Invalid input, Marks should be between 0 and 100");
                }
            } while (mathsMarks < 0 || mathsMarks > 100);

            do {
                System.out.print("Enter Marks of Subject Science\t:\t");
                scienceMarks = scanner.nextInt();
                if (scienceMarks < 0 || scienceMarks > 100) {
                    System.out.println("Invalid input, Marks should be between 0 and 100");
                }
            } while (scienceMarks < 0 || scienceMarks > 100);

            do {
                System.out.print("Enter Marks of Subject English\t:\t");
                englishMarks = scanner.nextInt();
                if (englishMarks < 0 || englishMarks > 100) {
                    System.out.println("Invalid input, Marks should be between 0 and 100");
                }
            } while (englishMarks < 0 || englishMarks > 100);

            int total = sum(mathsMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

            System.out.print("Do you want to enter marks for another student? (Y/N): ");
            continueAdding = scanner.next().charAt(0);
        }

        System.out.println("Program terminated.");
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = "-";
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        }
        return grade;
    }

    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, int total, int percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___|");
        System.out.println("| Name: " + name + "                  |");
        System.out.println("| Roll No: " + rollNum + "                 |");
        System.out.println("|___|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___|");
        System.out.println("| Math: " + mathsMarks + "                   |");
        System.out.println("| Science: " + scienceMarks + "                |");
        System.out.println("| English: " + englishMarks + "                |");
        System.out.println("|___|");
        System.out.println("| Total: " + total + "               |");
        System.out.println("|___|");
        System.out.println("| Percentage: " + percentage + "           |");
        System.out.println("| Result: " + result + "               |");
        System.out.println("| Grade: " + grade + "                  |");
        System.out.println("|___|");
    }
}

