package Komposisi;

public class MainProgram {
    public static void main(String[] args) {
        //Membuat object phone
        Person egssy = new Person("Samsung", "Android");

        //memanggil attribut dan nilai
        egssy.brand = "Samsung";
        egssy.start();
        egssy.run();
        egssy.shutdown();
    }
}
 