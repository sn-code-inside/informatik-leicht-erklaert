import java.lang.Math;
import java.util.Random;

public class TestClass {

    public static void main(String[] args){

        Random random = new Random();

        int randInt = random.nextInt(3);
        // Creates random int between 0 and 99

        double randDouble = random.nextDouble();

        if(randInt == 0){
           System.out.println("Nulli");
        }

        System.out.println(randInt);
    }
}
