package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes;

import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors.Color;

public class Circle extends Shape {

    private final Color colore;
    private final ShapeEnum nomeShape;

    public Circle(ShapeEnum nomeShape, Color colore) {
        this.colore = colore;
        this.nomeShape = nomeShape;
    }
}
