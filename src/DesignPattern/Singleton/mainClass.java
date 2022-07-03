package DesignPattern.Singleton;

public class mainClass {
    public static void main(String[] args){
        singleObject object = singleObject.getInstance();

        object.showMessage();

    }
}
