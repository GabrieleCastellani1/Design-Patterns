package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign;

import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors.ColorEnum;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors.ColorFactory;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.Circle;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.Shape;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.ShapeEnum;
import it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.shapes.Square;

public class ShapeFactory {

    private static ShapeFactory instance;
    public Shape createShape(ShapeEnum shape, ColorEnum color){
        ColorFactory factory = new ColorFactory();
        switch (shape){
            case CIRCLE: return new Circle(shape, factory.createColor(color));
            case SQUARE: return new Square(shape, factory.createColor(color));
            default: throw new RuntimeException();
        }
    }

    private ShapeFactory(){}

    public static ShapeFactory getInstance(){
        if(instance == null){
            instance = new ShapeFactory();
        }
        return instance;
    }
}
