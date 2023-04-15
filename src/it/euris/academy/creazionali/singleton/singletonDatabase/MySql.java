package it.euris.academy.creazionali.singleton.singletonDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MySql extends MapDatabase{
    private Map<Integer, String> database;

    public MySql(DatabaseCounter counter) {
        super(counter);
        this.database = new HashMap<>();
    }

    @Override
    public void insert(String value){
        database.put(counter.getCount(), value);
    }
}
