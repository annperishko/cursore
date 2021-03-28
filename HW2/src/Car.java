//уметь заводится, глушить мотор, ехать и держать необходимую скорость.

public class Car {
    private boolean Engine = false;
    private int Speed = 0;
    private int maxSpeed;
    private boolean move = false;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean startEngine() {
        if (Engine) {
            System.out.println("Engine is already on");
        } else {
            Engine = true;
            System.out.println("Engine is on");
        }
        return Engine;
    }

    public boolean stopEngine() {
        if (!Engine) {
            System.out.println("Engine is already off");
        } else if (move) {
            System.out.println("Stop the car, before turning off the engine!");

        } else {
            Engine = false;
            System.out.println("Engine is off");
        }
        return Engine;
    }

    public int setSpeed(int Speed) {

        if (Speed < 0 || Speed > maxSpeed) {
            System.out.println("Incorrect speed");
        } else {
            this.Speed = Speed;
        }

        if (Speed == 0 || !Engine) {
            move = false;
            System.out.println("Car isn`t moving");
        } else {
            move = true;
            System.out.println("Car is moving with speed " + Speed + " km/h");
        }
        return Speed;
    }


}
