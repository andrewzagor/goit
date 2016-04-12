package CollectionMusicInstrument;

/**
 * Created by ZahornyiAI on 23.03.2016.
 */
public class MusicalInstrument {
    private String name;
    private int quantity;
    private int price;

    public MusicalInstrument (final String name,final int quantity, final int price) {
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

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
