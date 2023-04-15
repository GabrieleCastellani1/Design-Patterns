package it.euris.academy.comportamentali.observer.refactoringGuruExample;

import it.euris.academy.comportamentali.observer.refactoringGuruExample.editor.Editor;
import it.euris.academy.comportamentali.observer.refactoringGuruExample.listeners.EmailNotificationListener;
import it.euris.academy.comportamentali.observer.refactoringGuruExample.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
