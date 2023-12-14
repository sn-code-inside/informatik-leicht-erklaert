package Kap5ErweiterteProgrammierung.SolutionExcercise5_10;

import java.util.Scanner;
import java.io.*;

public class Exercise5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();

        try{
            //path may vary on your PC
            String path = "C:\\User\\UserName\\Desktop\\TextFile.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(input);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
