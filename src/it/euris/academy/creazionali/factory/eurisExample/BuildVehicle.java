package it.euris.academy.creazionali.factory.eurisExample;
import it.euris.academy.creazionali.factory.eurisExample.Vehicle.VehicleType;

public class BuildVehicle {

    public SpeedInterface getVehicle(VehicleType vehicle) {
        switch (vehicle) {
            case CAR:
                return new Car(160);
            case BIKE:
                return new Bike(30);
            case TRAIN:
                return new Train(300);
            case AIRPLANE:
                return new Airplane(500);
            case MOTORCYCLE:
                return new Motorcycle(120);
            default:
                throw new RuntimeException("vehicle not recognised");
        }
    }
}
