package Kap5ErweiterteProgrammierung;

import java.io.*;

public class ReadData5_8_2 {
    public static void main(String[] args){
        try {
            //path may vary on your PC
            String path = "C:\\Users\\marco\\OneDrive\\Desktop\\TextFile.txt";
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String textRead;
            while ((textRead = reader.readLine()) != null) {
                System.out.println(textRead);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
