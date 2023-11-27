package Kap4Einfuehrung;

public class Conditions4_5_2 {
    public static void main(String[] args) {
        //number can be changed for different results
        int number = 7;
        int numberAfterIf = ifElseCondition(number);
        System.out.println(numberAfterIf);

        //season can be changed for different results
        String season = "spring";
        String month = switchCase1(season);
        System.out.println(month);

        //
        int monthNumber = 4;
        int numberOfDays = switchCase2(monthNumber);
        System.out.println(numberOfDays);
    }

    //Example 4.5
    public static int ifElseCondition(int number){
        if(number>4){
            number=number-3;
        }
        else{
            number=number+1;
        }
        return number;
    }

    //Example 4.6
    public static String switchCase1(String season){
        String month="";
        switch(season){
            case "spring":
                month="March-May";
                break;
            case "summer":
                month="June-August";
                break;
            case "fall":
                month="September-November";
                break;
            case "winter":
                month="December-February";
                break;
        }
        return month;
    }

    //Example 4.7
    public static int switchCase2(int monthNumber){
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
        return numberOfDays;
    }

}
