package it.euris.academy.strutturali.bridge.eurisExample.GoodDesign.colors;

public class Blue extends Color{
    private final ColorEnum nomeColore;
    public Blue(ColorEnum nomeColore) {
        super();
        this.nomeColore = nomeColore;
    }

    public ColorEnum getNome(){
        return nomeColore;
    }
}
