package DesignPattern.Decorate;

public class carClass implements vehicle {
    @Override
    public void ride() {
        System.out.println("Vehicle : Car");
    }
}
