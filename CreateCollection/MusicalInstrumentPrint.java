package CollectionMusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZahornyiAI on 23.03.2016.
 */
public class MusicalInstrumentPrint {
    public static void main(String[] args) {
        final List<MusicalInstrument> MusicalInstrumentList=new ArrayList<>();
        MusicalInstrumentList.add(new Guitar("Guitar",  34, 780));
        MusicalInstrumentList.add(new Piano("Piano", 12, 2390));
        MusicalInstrumentList.add(new Flute("Flute",  24,  1370));
        MusicalInstrumentList.add(new Trumpet("Trumpet", 19, 520));

        for (MusicalInstrument musicalInstrument: MusicalInstrumentList) {
            System.out.println(musicalInstrument);
        }
    }
}
