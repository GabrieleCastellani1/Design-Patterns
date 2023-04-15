package it.euris.academy.strutturali.decorator.eurisExample.notifier.exceptions;

public class NotExistingNotifierException extends Exception {
    public NotExistingNotifierException(){
        super("il notifier richiesto non esiste");
    }
}
