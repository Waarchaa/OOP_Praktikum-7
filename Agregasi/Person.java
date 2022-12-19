package Agregasi;

public class Person {
    public String nama, brand;
    public Phone handPhone;

    public Person(Phone hp) {
        handPhone = hp;
    }

    public void start() {
        handPhone.start();
    }

    public void shutdown() {
        handPhone.shutdown();
    }

    public void run() {
        System.out.println("Phone is ready to use");
    }
} 
