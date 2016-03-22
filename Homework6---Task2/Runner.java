package MusicShop;
import java.util.*;

/**
 * Created by ZahornyiAI on 18.03.2016.
 */
public class Runner {
    public static void main(String[] args) {

    MusicShop shop = new MusicShop();
        shop.setGuitars(25);
        shop.setPianos(15);
        shop.setTrumpets(9);

    System.out.println(shop);

    Map<String, Integer> order = new HashMap<>();
    order.put("guitar", 5);
    order.put("piano", 8);
    order.put("trumpets", 4);

    List<MusicInstrument> guitarToRemove = prepareOrder(shop, order);
    System.out.println("removed guitar: " + guitarToRemove.size());

    List<MusicInstrument> pianoToRemove = prepareOrder(shop, order);
    System.out.println("removed guitar: " + pianoToRemove.size());

    List<MusicInstrument> trumpetToRemove = prepareOrder(shop, order);
    System.out.println("removed guitar: " + trumpetToRemove.size());

    System.out.println(shop);
}

    private static List<MusicInstrument> prepareOrder(MusicShop shop, Map<String, Integer> order) {
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrumpetsToRemove = order.get("trumpet");

        if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
        if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
        if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

        List<MusicInstrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarsToRemove; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < numberOfPianosToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
            result.add(new Trumpet());
        }
        return result;}}
