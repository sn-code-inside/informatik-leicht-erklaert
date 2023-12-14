package Kap5ErweiterteProgrammierung;

public class OperationsWithDatatypes5_1 {
    public static void main(String[] args) {

    }

    //Example 5.1
    public static void arithmeticOperations(){
        int number1 = 21;
        int number2 = 4;

        // sum = 21 + 4 = 25
        int sum = number1 + number2;

        // difference = 21 - 4 = 17
        int difference = number1 - number2;

        // product = 21 * 4 = 84
        int product = number1 * number2;

        // quotient = 21 / 4 = 5 != 5.25
        int quotient = number1 / number2;

        // doubleQuotient = 21 / 4 = 5.0 != 5.25
        double doubleQuotient = number1 / number2;
    }

    //Example 5.2
    public static void calculateQuotient(){
        int intNumber = 21;
        double doubleNumber = 4.0;

        //quotient = 21 / 4.0 = 5.25
        double quotient = intNumber / doubleNumber;
    }
}
