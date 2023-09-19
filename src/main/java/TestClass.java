public class TestClass {

    public static void main(String[] args){
        int monthNumber=8;
        int numberOfDays;
        switch(monthNumber){
            case 2:
                numberOfDays=28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays=30;
                break;
            default:
                numberOfDays=31;
    }
    System.out.println(numberOfDays);

}}
