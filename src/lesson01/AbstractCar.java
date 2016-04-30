package lesson01;

/**
 * Sergej Povzaniuk
 * 2016-04-29.
 */
public abstract class AbstractCar implements Car {
    protected int speed = 100;

    public void go() {
        out(this.getClass().getSimpleName() + "GO! With speed: " + speed);
    }

    private void out(String str){
        System.out.println(str);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
