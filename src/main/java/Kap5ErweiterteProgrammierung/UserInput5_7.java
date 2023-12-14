package Kap5ErweiterteProgrammierung;

import java.util.Scanner;

public class UserInput5_7 {
    public static void main(String[] args) {
        //use explanations method
        explanations();

        //use example Method
        example5_15();
    }

    public static void explanations(){
        Scanner scanner = new Scanner(System.in);

        int intInput = scanner.nextInt();
        System.out.println("Input is: " + intInput);

        double doubleInput = scanner.nextDouble();
        System.out.println("Input is: " + doubleInput);

        String stringInput = scanner.next();
        System.out.println("Input is: " + stringInput);

        String lineInput = scanner.nextLine();
        System.out.println("Input is: " + lineInput);

        scanner.close();
    }

    public static void example5_15(){
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);
        // Read input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        // Close Scanner after use
        scanner.close();
    }
}
