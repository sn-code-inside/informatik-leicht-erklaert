package Kap5ErweiterteProgrammierung.SolutionExcercise5_10;

import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number!");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number!");
        int number2 = scanner.nextInt();
        System.out.println("Enter math-operation!");
        String mathOperation =  scanner.next();

        int solution;
        //switch-case is used to calculate solution
        switch (mathOperation){
            case "+":
                solution = number1 + number2;
                break;
            case "-":
                solution = number1 - number2;
                break;
            case "*":
                solution = number1 * number2;
                break;
            case "/":
                solution = number1 / number2;
                break;
            default:
                solution = 0;
                System.out.println("invalid symbol!");
        }

        System.out.println("The solution is " + solution);

    }
}
