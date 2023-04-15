package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors;

public class Red extends Color{
    private final ColorEnum nomeColore;
    public Red(ColorEnum nomeColore) {
        super();
        this.nomeColore = nomeColore;
    }

    public ColorEnum getNome(){
        return nomeColore;
    }
}
