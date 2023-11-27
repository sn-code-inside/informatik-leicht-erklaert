package OOP;

public class Phone {
    //attributes
    String owner;
    int battery;

    //constructor
    public Phone(String owner, int battery){
        this.owner = owner;
        this.battery = battery;
    }

    public Phone(String owner){
        this.owner = owner;
        //this.battery = 0;
    }

    public Phone(){
    }

    //methods
    public void call(String name){
        System.out.println(owner +" is calling " + name);
    }

    public void chargeBattery() {
        this.battery = 100;
    }
}
