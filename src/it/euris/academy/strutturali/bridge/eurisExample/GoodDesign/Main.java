package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign;

import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors.ColorEnum;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.Shape;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.ShapeEnum;

public class Main {
    ShapeFactory factory = ShapeFactory.getInstance();
    Shape shape = factory.createShape(ShapeEnum.SQUARE, ColorEnum.RED);
}
