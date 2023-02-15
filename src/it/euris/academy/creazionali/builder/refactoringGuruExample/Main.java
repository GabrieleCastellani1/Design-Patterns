package it.euris.academy.creazionali.builder.refactoringGuruExample;

import it.euris.academy.creazionali.builder.refactoringGuruExample.builders.CarBuilder;
import it.euris.academy.creazionali.builder.refactoringGuruExample.builders.CarManualBuilder;
import it.euris.academy.creazionali.builder.refactoringGuruExample.cars.Car;
import it.euris.academy.creazionali.builder.refactoringGuruExample.cars.Manual;
import it.euris.academy.creazionali.builder.refactoringGuruExample.director.Director;

/**
 * Main class. Everything comes together here.
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
