package CollectionMusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
// Encryption шифрует коллекцию музыкальных инструментов
public class Encryption {
    public static void main(String[] args) {
        final List<MusicalInstrument> musicalInstrumentListForEncryption = new ArrayList<>();
        musicalInstrumentListForEncryption.add(new Guitar("Guitar",  35, 780));
        musicalInstrumentListForEncryption.add(new Piano("Piano", 13, 2390));
        musicalInstrumentListForEncryption.add(new Flute("Flute",  23,  1370));
        musicalInstrumentListForEncryption.add(new Trumpet("Trumpet", 17, 520));

    int key =3;

        EnglishCesarEncrypt textencrypt = new EnglishCesarEncrypt();
        String  MusInstrString=String.valueOf(musicalInstrumentListForEncryption);
        String MusInstrEncr=(textencrypt.applyCaesar(MusInstrString, key));

        System.out.println(MusInstrEncr);
    }}

