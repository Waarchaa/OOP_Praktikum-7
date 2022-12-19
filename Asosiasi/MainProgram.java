package Asosiasi;

public class MainProgram {
    public static void main(String[] args) {
        //membuat object Phone
        Phone handPhone = new Phone();

        //Memanggil attribut dan nilai
        handPhone.brand = "SAMSUNG";
        handPhone.OS = "MIUI";

        Person naswa = new Person("Naswa");

        naswa.brand = "Xiaomi";
        naswa.Hp = handPhone;
        naswa.start();
        naswa.run();
        naswa.shutdown();
    }
} 
