package Kap5ErweiterteProgrammierung.SolutionExcercise5_10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise5_2 {

    public static void main(String[] args) {
        //use one of these methods to get number

        int number = useScanner();
        //int number = useRandom();

        collatzAlgorithm(number);

    }

    public static void collatzAlgorithm(int number){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(number);
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            list.add(number);
        }
        System.out.println(list);
    }

    public static int useScanner(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }


    public static int useRandom(){
        Random random = new Random();
        //number can be changed if necessary
        return random.nextInt(200);
    }
}
