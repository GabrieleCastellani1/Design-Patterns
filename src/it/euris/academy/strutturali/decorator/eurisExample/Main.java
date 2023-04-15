package it.euris.academy.strutturali.decorator.eurisExample;

import it.euris.academy.strutturali.decorator.eurisExample.notifier.NotifierFactory;
import it.euris.academy.strutturali.decorator.eurisExample.notifier.NotifierType;
import it.euris.academy.strutturali.decorator.eurisExample.notifier.exceptions.NotExistingNotifierException;

public class Main {
    public static void main(String[] args) {
        NotifierFactory factory = NotifierFactory.getInstance();
        try {
            Application app1 = new Application(factory.createNotifier(NotifierType.FACEBOOK));
            Application app2 = new Application(factory.createNotifier(NotifierType.WHATSAPP));
            app1.doSomething("ALERT!");
            app2.doSomething("ALERT!");
        } catch (NotExistingNotifierException e) {
            throw new RuntimeException(e);
        }
    }
}
