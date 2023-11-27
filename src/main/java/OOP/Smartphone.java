package OOP;

public class Smartphone extends Phone{
    int freeMemory;
    String brand;

    public Smartphone(String owner, int battery, int freeMemory, String brand){
        this.owner = owner;
        this.battery = battery;
        this.freeMemory = freeMemory;
        this.brand = brand;
    }

    public void takePicture(){
        System.out.println("Picture was taken");
    }

    @Override
    public void call(String name){
        System.out.println(owner +" is calling " + name+" with a smartphone");
    }
}
