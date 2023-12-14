package Kap5ErweiterteProgrammierung;
import java.lang.Math;

public class UseMathBib5_6 {
    public static void main(String[] args) {
        int input = 45;
        double squareRoot = Math.sqrt(input);
        System.out.println("The square root of " + input + " is " + squareRoot);

        double radiantOf = Math.toRadians(input);
        double sineOf = Math.sin(radiantOf);
        System.out.println("The sine of " + radiantOf + " is " + sineOf);

        double pi = Math.PI;
        double euler = Math.E;
    }
}
