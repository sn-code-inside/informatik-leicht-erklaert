package OOP;

public class MakePhones {
    public static void main(String args[]){
        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();
        //creates 2 objects from class Smartphone

        phone1.owner = "Tom";
        phone1.battery = 100;
        phone1.freeMemory = 245.7;
        // sets values to attributes of phone1

        phone2.call("Lea");
        // phone2 makes call to Lea

    }
}
