package CollectionMusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */

 // Decryption расшифровывает коллекцию музыкальных инструментов.
    // В этом классе, я вначале зашифровываю коллекцию, потом ее дешифрую, результат должен получится аналогичный если бы
    // я вывел коллекцию в консоль
public class Decryption {
    public static void main(String[] args) {
        final List<MusicalInstrument> MusicalInstrumentListForEncryption=new ArrayList<>();
        MusicalInstrumentListForEncryption.add(new Guitar("Guitar",  35, 780));
        MusicalInstrumentListForEncryption.add(new Piano("Piano", 13, 2390));
        MusicalInstrumentListForEncryption.add(new Flute("Flute",  23,  1370));
        MusicalInstrumentListForEncryption.add(new Trumpet("Trumpet", 17, 520));

        int key =3;
        int m=4;

        EnglishCesarEncrypt textencrypt = new EnglishCesarEncrypt ();
        textencrypt.applyCaesar(String.valueOf(MusicalInstrumentListForEncryption), key);
        EnglishCesarDecrypt textdecrypt = new EnglishCesarDecrypt();
        System.out.println(String.valueOf(textdecrypt.applyCaesar1(textencrypt.applyCaesar(String.valueOf(MusicalInstrumentListForEncryption), key),key)));
}}
