package it.euris.academy.creazionali.builder.eurisExample;

import java.util.ArrayList;
import java.util.List;

import it.euris.academy.creazionali.builder.eurisExample.Item.ItemBuilder;
import it.euris.academy.creazionali.builder.eurisExample.Address.AddressBuilder;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Italia", "Via X", "33502");
        Address a2 = new Address("Francia", "Via Y", "33451");
        Address a3 = new Address("Germania", "Via Z", "88912");
        Address a4 = AddressBuilder.builder().setAddress("Via W").setCountry("America").build();
        Item i1 = new Item(4, 45,"sedia", "è una sedia");
        Item i2 = new Item(3, 12, "tappeto", null);
        Item i3 = new Item(7, 20, "vaso", null);
        Item i4 = new Item(5,  3, "tovaglia", null);
        Item i5 = new Item(9, 10, "biccchieri", null);

        Item i6 = ItemBuilder.builder().setCost(12).setId(5).build();

        List<Item> list1 = new ArrayList<>();
        list1.add(i1);
        list1.add(i2);
        ShoppingCart s1 = new ShoppingCart(0, 20, 12, a1, list1);
        List<Item> list2 = new ArrayList<>();
        list2.add(i3);
        ShoppingCart s2 = new ShoppingCart(1, 30, 5, a2, list2);
    }
}
