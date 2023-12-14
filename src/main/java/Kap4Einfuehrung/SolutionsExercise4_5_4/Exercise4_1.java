package Kap4Einfuehrung.SolutionsExercise4_5_4;

public class Exercise4_1 {
    public static void main(String[] args) {
        doWhileSolution();
    }

    //solution with for-loop
    public static void forSolution(){
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
    }
    //solution with while-loop
    public static void whileSolution(){
        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    //solution with do-while-loop
    public static void doWhileSolution(){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
