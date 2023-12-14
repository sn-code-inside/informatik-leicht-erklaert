package Kap5ErweiterteProgrammierung;

public class Methods5_4 {
    public static void main(String[] args) {
        int sumMethod = calcSum(1,2);
        System.out.println(sumMethod);

        sayBye();
    }

    //example 5.12
    public static int calcSum(int firstNr, int secondNr){
        return firstNr + secondNr;
    }

    public static void sayBye(){
        System.out.println("Bye");
    }
}
