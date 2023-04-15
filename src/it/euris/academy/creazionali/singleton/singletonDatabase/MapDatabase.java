package it.euris.academy.creazionali.singleton.singletonDatabase;

public abstract class MapDatabase {
    protected DatabaseCounter counter;

    protected MapDatabase(DatabaseCounter counter) {
        this.counter = counter;
    }
    public DatabaseCounter getCounter() {
        return counter;
    }

    public abstract void insert(String value);
}
