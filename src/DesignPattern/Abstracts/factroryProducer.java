package DesignPattern.Abstracts;

public class factroryProducer {
    public static abstractFactory getFactory(boolean vehicle){
        if (vehicle){
            return new vehicleFactory();
        }else {
            return new bigVehicleFactory();
        }
    }
}
