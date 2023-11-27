package OOP;

public class CreatePhoneObject {
    public static void main(String[] args){
        //create objects
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        //set attributes
        phone1.owner = "Tom";
        phone1.battery = 73;

        phone2.owner = "Lea";

        //use methods
        phone1.call("Bob");

        phone2.chargeBattery();

        Phone phone3 = new Phone("Sara", 50);

        Phone phone4 = new Phone("Tim");
        System.out.println(phone4.battery);
    }
}
