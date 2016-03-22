package MusicShop;

/**
 * Created by ZahornyiAI on 18.03.2016.
 */
abstract public class MusicInstrument {public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{"+getType()+"}";
    }
}
