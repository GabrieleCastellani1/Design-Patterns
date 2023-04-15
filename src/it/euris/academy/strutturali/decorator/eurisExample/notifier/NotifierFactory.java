package it.euris.academy.strutturali.decorator.eurisExample.notifier;

import it.euris.academy.strutturali.decorator.eurisExample.notifier.exceptions.NotExistingNotifierException;

public class NotifierFactory {

    private static NotifierFactory instance;

    private NotifierFactory(){}

    public static NotifierFactory getInstance(){
        if(instance == null){
            instance = new NotifierFactory();
        }
        return instance;
    }
    public Notifier createNotifier(NotifierType type) throws NotExistingNotifierException {
        switch(type){
            case SLACK: return new SlackNotifier();
            case FACEBOOK: return new FaceBookNotifier();
            case WHATSAPP: return new WhatsAppNotifier();
            default: throw new NotExistingNotifierException();
        }
    }
}
