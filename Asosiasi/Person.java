package Asosiasi;

public class Person {
    public String nama, brand;
    public Phone Hp;

    public Person(String nama){
        this.nama = nama;
    }

    public void start(){
        Hp.start();
    }
    public void shutdown(){
        Hp.shutdown();
    }
    public void run(){
        System.out.println("Phone is ready to use");
    }
}
 