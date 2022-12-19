package Asosiasi;

public class Phone implements EIPhone {
    public String brand;
    public String OS;

    @Override
    public void start(){
        System.out.println("Phone is getting ready..");
    }
    @Override
    public void shutdown(){
        System.out.println("Phone is shutting down..");
    }

}
 