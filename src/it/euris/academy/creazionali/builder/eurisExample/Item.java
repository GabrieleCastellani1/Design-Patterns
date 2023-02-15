package it.euris.academy.creazionali.builder.eurisExample;

public class Item {
    private int id;
    private double cost;
    private String name;
    private String desription;

    public Item(int id, double cost, String name, String desription) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.desription = desription;
    }

    private Item(){}

    public static class ItemBuilder{

        private final Item item;

        private ItemBuilder(){
            this.item = new Item();
        }

        public static ItemBuilder builder(){
            return new ItemBuilder();
        }

        public ItemBuilder setId(int id){
            this.item.id = id;
            return this;
        }

        public ItemBuilder setCost(double cost){
            this.item.cost = cost;
            return this;
        }

        public ItemBuilder setName(String name){
            this.item.name = name;
            return this;
        }

        public ItemBuilder setDescription(String description){
            this.item.desription = description;
            return this;
        }

        public Item build(){
            return this.item;
        }
    }
}
