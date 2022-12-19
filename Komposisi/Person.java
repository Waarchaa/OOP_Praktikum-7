package Komposisi;

public class Person {
    public String brand;
    public Phone handPhone;

    public Person(String brand, String OS){
        handPhone = new Phone();
        handPhone.brand = brand;
        handPhone.OS = OS;
    }

    public void start(){
        handPhone.start();
    }

    public void shutdown(){
        handPhone.shutdown();
    }

    public void run(){
        System.out.println("Phone is running..");
    }
}
