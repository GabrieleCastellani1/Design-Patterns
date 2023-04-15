package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes;

import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors.Color;

public class Square extends Shape {

    private final Color colore;
    private final ShapeEnum nomeShape;

    public Square(ShapeEnum nomeShape, Color colore) {
        this.colore = colore;
        this.nomeShape = nomeShape;
    }

    public ShapeEnum getNomeShape() {
        return nomeShape;
    }

    public Color getColore() {
        return colore;
    }
}
