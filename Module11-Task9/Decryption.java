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
        final List<MusicalInstrument> musicalInstrumentListForEncryption=new ArrayList<>();
        musicalInstrumentListForEncryption.add(new Guitar("Guitar",  35, 780));
        musicalInstrumentListForEncryption.add(new Piano("Piano", 13, 2390));
        musicalInstrumentListForEncryption.add(new Flute("Flute",  23,  1370));
        musicalInstrumentListForEncryption.add(new Trumpet("Trumpet", 17, 520));

        int key =3;

        EnglishCesarEncrypt textencrypt = new EnglishCesarEncrypt ();
        String MusInstString1 = String.valueOf(musicalInstrumentListForEncryption);
        String MusInstrEncr = textencrypt.applyCaesar(MusInstString1, key);
        EnglishCesarDecrypt textdecrypt = new EnglishCesarDecrypt();
        String MusInstString2=String.valueOf(MusInstrEncr);
        String MusInstrDecr=textdecrypt.applyCaesar1(MusInstString2,key);
        System.out.println(MusInstrDecr);
}}
