package it.euris.academy.strutturali.decorator.eurisExample.notifier;

public class SlackNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("messaggio inviato da notifier: \n" + message);
    }
}
