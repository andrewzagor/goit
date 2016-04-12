package CollectionMusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
// Encryption шифрует коллекцию музыкальных инструментов
public class Encryption {
    public static void main(String[] args) {
        final List<MusicalInstrument> MusicalInstrumentListForEncryption=new ArrayList<>();
        MusicalInstrumentListForEncryption.add(new Guitar("Guitar",  35, 780));
        MusicalInstrumentListForEncryption.add(new Piano("Piano", 13, 2390));
        MusicalInstrumentListForEncryption.add(new Flute("Flute",  23,  1370));
        MusicalInstrumentListForEncryption.add(new Trumpet("Trumpet", 17, 520));

    int key =3;
    int m=2;

    EnglishCesarEncrypt textencrypt = new EnglishCesarEncrypt();
        System.out.println(textencrypt.applyCaesar(String.valueOf(MusicalInstrumentListForEncryption), key));
    }}

