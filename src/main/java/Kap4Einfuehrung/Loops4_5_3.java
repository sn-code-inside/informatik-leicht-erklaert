package Kap4Einfuehrung;

public class Loops4_5_3 {
    public static void main(String[] args) {
        //this statement uses method with for-loop
        breakExampleFor();
        //this statement uses method with while-loop
        breakExampleWhile();
    }

    //Example 4.8 with for-loop
    public static void breakExampleFor(){
        //variables can be changed for different results
        int age = 20;
        //can be changed to false for different result
        boolean isStudent = true;

        for(int i=0; i<5; i++){
            System.out.println(age);
            if(isStudent==false && i==1){
                break;
            }
            age++;
        }
    }

    public static void breakExampleWhile(){
        int age = 20;
        //can be changed to false for different result
        boolean isStudent = true;
        int i = 0;
        while(i<5){
            System.out.println(age);
            if(isStudent==false && i==1){
                break;
            }
            age++;
            i++;
        }
    }

}
