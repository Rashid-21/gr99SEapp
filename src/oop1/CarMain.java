package oop1;

public class CarMain {
    public static void main(String[] args) {

        Car toyota = new Toyota();
        toyota.start();
        toyota.stop();
        carTesting(toyota);

        Car bmw = new Bmw();
        bmw.start();
        bmw.stop();
        carTesting(bmw);

    }

    static void carTesting(Car data) {
        System.out.println("Testing is Ok");

    }

}
