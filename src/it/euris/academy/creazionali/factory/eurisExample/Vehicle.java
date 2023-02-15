package it.euris.academy.creazionali.factory.eurisExample;

public class Vehicle implements SpeedInterface {

    private final int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    public enum VehicleType{
        MOTORCYCLE,
        CAR,
        BIKE,
        AIRPLANE,
        TRAIN
    }
}
