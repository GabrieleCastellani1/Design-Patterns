package it.euris.academy.creazionali.builder.refactoringGuruExample.builders;

import it.euris.academy.creazionali.builder.refactoringGuruExample.cars.Car;
import it.euris.academy.creazionali.builder.refactoringGuruExample.cars.CarType;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.Engine;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.GPSNavigator;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.Transmission;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
