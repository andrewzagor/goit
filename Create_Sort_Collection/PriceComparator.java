package CollectionMusicInstrument;
import java.util.Comparator;

/**
 * Created by ZahornyiAI on 23.03.2016.
 */
public class PriceComparator implements Comparator<MusicalInstrument> {

    @Override
    public int compare(MusicalInstrument MusicalInstrument1, MusicalInstrument MusicalInstrument2) {
        if(MusicalInstrument1.getPrice()> MusicalInstrument2.getPrice())
            return 1;
        else if(MusicalInstrument1.getPrice()< MusicalInstrument2.getPrice())
            return -1;
        else
            return 0;
    }
}
