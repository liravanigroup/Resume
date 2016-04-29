package main;

/**
 * Sergej Povzaniuk
 * 2016-04-29.
 */
public class RaceCar extends AbstractCar {
    RaceCar(){
        speed = 200;
    }


    @Override
    public float getEngineVolume() {
        return 23.5F;
    }
}
