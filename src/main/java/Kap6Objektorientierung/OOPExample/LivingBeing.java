package Kap6Objektorientierung.OOPExample;

public abstract class LivingBeing {
    int age;

    public void getOlder(int age){
        this.age = age+1;
    }
}
