package it.euris.academy.creazionali.singleton.singletonDatabase;

public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory = new DatabaseFactory();
        DatabaseCounter counter = DatabaseCounter.getInstance();
        MapDatabase mySql = factory.createDatabase(DatabaseEnum.MYSQL, counter);
        MapDatabase postgreSql = factory.createDatabase(DatabaseEnum.POSTGRESQL, counter);
        MapDatabase pssql = factory.createDatabase(DatabaseEnum.PSSQL, counter);

        mySql.insert("uno");
        postgreSql.insert("due");
        pssql.insert("tre");

        System.out.println(mySql.getCounter().getCount());
        System.out.println(postgreSql.getCounter().getCount());
        System.out.println(pssql.getCounter().getCount());
    }
}
