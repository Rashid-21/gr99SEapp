package oop1;

public class Toyota extends Car {
    String tPackage;

    @Override
    void start() {
        System.out.println("Toyota Starting");
    }

    @Override
    void stop() {
        System.out.println("Toyota Stopping");
    }
}
