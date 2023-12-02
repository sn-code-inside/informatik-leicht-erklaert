package Kap5ErweiterteProgrammierung;

import java.util.Random;

public class RandomNumbers5_6 {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        System.out.println(randomNumber);

        Random random = new Random();

        // Creates random int from 0 to 99
        int randInt = random.nextInt(100);

        // Creates random double from 0 to 1
        double randDouble = random.nextDouble();

        System.out.println(randInt);

        System.out.println(randDouble);

    }
}
