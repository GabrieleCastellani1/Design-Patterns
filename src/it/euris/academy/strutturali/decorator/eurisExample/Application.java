package it.euris.academy.strutturali.decorator.eurisExample;

import it.euris.academy.strutturali.decorator.eurisExample.notifier.Notifier;

public class Application {
    private Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSomething(String msg){
        notifier.send(msg);
    }
}
