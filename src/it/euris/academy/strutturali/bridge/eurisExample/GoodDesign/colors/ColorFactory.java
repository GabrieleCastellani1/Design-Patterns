package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors;

public class ColorFactory {
    public Color createColor(ColorEnum color){
        switch (color){
            case RED: return new Red(color);
            case BLUE: return new Blue(color);
            default: throw new RuntimeException();
        }
    }
}
