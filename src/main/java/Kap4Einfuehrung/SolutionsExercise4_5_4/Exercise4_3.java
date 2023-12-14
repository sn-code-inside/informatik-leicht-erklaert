package Kap4Einfuehrung.SolutionsExercise4_5_4;

public class Exercise4_3 {
    public static void main(String[] args) {
        //number can be changed
        int number = 37;

        while(number != 1){
            if(number%2==0){
                number = number /2;
            }else{
                number = 3 * number +1;
            }
            System.out.println(number);
        }
    }
}
