package MusicShop;

/**
 * Created by ZahornyiAI on 18.03.2016.
 */
public class MusicShop {
    int guitars;
    int pianos;
    int trumpets;

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public int getPianos() {
        return pianos;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "guitars=" + guitars +
                ", piano=" + pianos +
                ", trumpet=" + trumpets +
                '}';}
}
