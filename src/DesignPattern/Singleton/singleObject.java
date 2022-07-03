package DesignPattern.Singleton;

public class singleObject {
    private static singleObject instance = new singleObject();

    private singleObject() {
    }

    public static singleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Is this singleton or not");
    }
}
