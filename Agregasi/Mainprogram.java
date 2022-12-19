package Agregasi;

public class Mainprogram {
    public static void main(String[] args) {
        // membuat object phone
        Phone handPhone = new Phone();

        // memanggil attribut dan nilai
        handPhone.brand = "SAMSUNG";
        handPhone.OS = "OneUI";

        Person wawa = new Person(handPhone);

        wawa.brand = "SAMSUNG";
        wawa.start();
        wawa.run();
        wawa.shutdown();
    }
}
 