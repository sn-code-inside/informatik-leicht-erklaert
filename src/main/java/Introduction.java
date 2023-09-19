public class Introduction {
    public static void main(String[] args){
        System.out.println("Hallo Welt!");

        String name = "Sebastian";
        int age = 21;
        double averageGrade;
        boolean isStudent = false;
        averageGrade = 2.1;

        for(int i=0; i<5; i++){
            System.out.println(age);
            if(isStudent==false && i==1){
                break;
            }
            age++;
        }


    }
}
