package it.euris.academy.creazionali.builder.refactoringGuruExample.builders;

import it.euris.academy.creazionali.builder.refactoringGuruExample.cars.CarType;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.Engine;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.GPSNavigator;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.Transmission;
import it.euris.academy.creazionali.builder.refactoringGuruExample.components.TripComputer;

/**
     * Builder interface defines all possible ways to configure a product.
     */
    public interface Builder {
        void setCarType(CarType type);
        void setSeats(int seats);
        void setEngine(Engine engine);
        void setTransmission(Transmission transmission);
        void setTripComputer(TripComputer tripComputer);
        void setGPSNavigator(GPSNavigator gpsNavigator);
    }
