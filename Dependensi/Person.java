package Dependensi;
public class Person {
    String nama;
    int umur;
    String brandPhone;

    public Person (String nama){
        this.nama = nama;
    }

    public void start(Phone ip){
        ip.start();
    }

    public void shutdown(Phone ip){
        ip.shutdown();
    }

    public void run(){
        System.out.println("Phone is running..");
    }
} 
