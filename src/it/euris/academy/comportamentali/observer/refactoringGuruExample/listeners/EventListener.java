package it.euris.academy.comportamentali.observer.refactoringGuruExample.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
