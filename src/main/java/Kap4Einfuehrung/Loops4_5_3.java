package Kap4Einfuehrung;

public class Loops4_5_3 {
    public static void main(String[] args) {

    }

    //Example 4.8
    public static void breakExample(){
        //variables can be changed for different results
        int age = 20;
        boolean isStudent = false;

        for(int i=0; i<5; i++){
            System.out.println(age);
            if(isStudent==false && i==1){
                break;
            }
            age++;
        }
    }
}
