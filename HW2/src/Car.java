
public class Car {
    private boolean engine = false;
    private int speed = 0;
    private int maxSpeed;
    private boolean move = false;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean startEngine() {
        if (engine) {
            System.out.println("Engine is already on");
        } else {
            engine = true;
            System.out.println("Engine is on");
        }
        return engine;
    }

    public boolean stopEngine() {
        if (!engine) {
            System.out.println("Engine is already off");
        } else if (move) {
            System.out.println("Stop the car, before turning off the engine!");

        } else {
            engine = false;
            System.out.println("Engine is off");
        }
        return engine;
    }

    public int setSpeed(int speed) {

        if (speed < 0 || speed > maxSpeed) {
            System.out.println("Incorrect speed");
        } else {
            this.speed = speed;
        }

        if (speed == 0 || !engine) {
            move = false;
            System.out.println("Car isn`t moving");
        } else {
            move = true;
            System.out.println("Car is moving with speed " + speed + " km/h");
        }
        return speed;
    }


}
