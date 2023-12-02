package Kap5ErweiterteProgrammierung;

import java.io.*;

public class WriteData5_8_1 {
    public static void main(String[] args){
        try{
            //path may vary on your PC
            String path = "C:\\User\\UserName\\Desktop\\TextFile.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write("Hello World!");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}