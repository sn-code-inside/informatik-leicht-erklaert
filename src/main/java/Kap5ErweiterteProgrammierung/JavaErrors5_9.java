package Kap5ErweiterteProgrammierung;

public class JavaErrors5_9 {
    public static void main(String[] args) {
        runTimeError();
    }

    static void compilerError(){
        //creates type Error by using math operation on String
        String name = "tom";
        //remove next comment to cause error
        //name / 3;
    }

    static void runTimeError(){
        //create array of length 5
        int[] first5Numbers = new int[5];
        //fill array with numbers
        for(int i = 0; i<5; i++){
            first5Numbers[i]=i;
        }
        //call index bigger than length of array
        System.out.println(first5Numbers[7]);
    }

    static void logicError(int number){
        if(number>0){
            System.out.println(">0");
        }
        if(number<0){
            System.out.println("<0");
        }
    }
}
