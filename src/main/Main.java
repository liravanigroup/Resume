package main;

/**
 * Sergej Povzaniuk
 * 2016-04-29.
 */
public class Main {
    public static void main(String[] args) {
        AbstractCar raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();
        raceCar.go();
        simpleCar.go();

    }
}
