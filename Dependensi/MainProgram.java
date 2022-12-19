package Dependensi;
public class MainProgram {
    public static void main(String[] args) {
        //membuat objek Phone
        Phone iPhone = new Phone();

        //memanggil attribut dan nilai
        iPhone.brand = "Apple";
        iPhone.OS = "IOS";

        Person P1 = new Person("Adjie");
        P1.brandPhone = "Apple";
        P1.start(iPhone);
        P1.run();
        P1.shutdown(iPhone);
    }
} 
