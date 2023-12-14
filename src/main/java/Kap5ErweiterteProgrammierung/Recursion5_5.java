package Kap5ErweiterteProgrammierung;

public class Recursion5_5 {

    public static void main(String[] args) {
        int number = 4;
        int factorialRec = factorial(number);
        int factorialIt = factorialIterative(number);

        System.out.println("Recursive Solution: "+factorialRec);
        System.out.println("Iterative Solution: "+factorialIt);

    }

    //recursive method
    public static int factorial(int input) {
        if (input <= 1) {
            return 1;
        } else {
            return (input) * factorial(input - 1);
        }

    }

    //iterative method
    public static int factorialIterative(int input){
        int factorial = 1;
        for(int i=input;i>=1;i--){
            factorial = factorial * i;
        }

        return factorial;
    }
}