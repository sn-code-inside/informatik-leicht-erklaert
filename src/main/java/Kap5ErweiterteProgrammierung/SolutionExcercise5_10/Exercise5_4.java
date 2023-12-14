package Kap5ErweiterteProgrammierung.SolutionExcercise5_10;

import java.util.Scanner;

public class Exercise5_4 {
    public static void main(String[] args) {
        int matches = 25;

        Scanner scanner = new Scanner(System.in);
        while(matches > 0){
            System.out.println("There are " + matches + " matches left.");
            System.out.println("Pick 1-3 matches!");
            matches = matches - scanner.nextInt();
        }
        System.out.println("You win!");
    }
}
