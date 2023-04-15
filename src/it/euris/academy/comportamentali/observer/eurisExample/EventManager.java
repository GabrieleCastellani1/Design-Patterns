package it.euris.academy.comportamentali.observer.eurisExample;

import java.util.Map;

public class EventManager {
    private Map<EventType, Listener> listeners;

    public void subscribe(EventType event, Listener listener){
        listeners.put(event, listener);
    }

    public void unsubscribe(EventType event, Listener listener){
        listeners.remove(event, listener);
    }

    public void notify(EventType event, String data){
        //listeners.forEach(l -> l.update(data));
    }
}
