package it.euris.academy.creazionali.singleton.singletonDatabase;

public class DatabaseCounter {
    private static DatabaseCounter counter;
    private int count;
    private DatabaseCounter(){
        count = 0;
    }

    public static DatabaseCounter getInstance(){
        if(counter == null){
            counter = new DatabaseCounter();
        }
        return counter;
    }

    public int getCount(){
        return count++;
    }

    public void diminishCount(){
        count--;
    }
}
