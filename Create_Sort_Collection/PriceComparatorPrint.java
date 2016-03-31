package CollectionMusicInstrument;
import java.util.TreeSet;

/**
 * Created by ZahornyiAI on 23.03.2016.
 */
public class PriceComparatorPrint {
    public static void main(String[] args) {


        PriceComparator prcomp=new PriceComparator();
        TreeSet<MusicalInstrument> MusInstr = new TreeSet<MusicalInstrument>(prcomp);

    MusInstr.add(new MusicalInstrument("Guitar",  34, 780));
    MusInstr.add(new MusicalInstrument("Piano", 12, 2390));
    MusInstr.add(new MusicalInstrument("Flute",  24,  1370));
    MusInstr.add(new MusicalInstrument("Trumpet", 19, 520));

        for (MusicalInstrument mi: MusInstr) {
            System.out.println(mi);
        }
    }}
