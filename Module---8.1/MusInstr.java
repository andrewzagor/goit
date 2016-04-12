package TableCollection;

import CollectionMusicInstrument.Flute;
import CollectionMusicInstrument.Guitar;
import CollectionMusicInstrument.Piano;
import CollectionMusicInstrument.Trumpet;

import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
public class MusInstr {
    private String name;
    private int quantity;
    private int price;

    public MusInstr (final String name,final int quantity, final int price) {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() { return price;}

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
