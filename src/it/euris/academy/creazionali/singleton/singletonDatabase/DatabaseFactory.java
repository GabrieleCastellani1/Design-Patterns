package it.euris.academy.creazionali.singleton.singletonDatabase;

public class DatabaseFactory {
    public MapDatabase createDatabase(DatabaseEnum name, DatabaseCounter counter){
        switch (name){
            case MYSQL: return new MySql(counter);
            case PSSQL: return new PostgreSql(counter);
            case POSTGRESQL: return new PostgreSql(counter);
            default: throw new RuntimeException();
        }
    }
}
