package CollectionMusicInstrument;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class DecryptionTest {

    @Test
    public void testMain() throws Exception {
        String MusInstrEncr="\\NvtjdbmJotusvnfou|obnf>(Hvjubs(-!rvboujuz>46-!qsjdf>891~^";
        int key=1;

        EnglishCesarDecrypt textdecrypt = new EnglishCesarDecrypt();
        String MusInstString2=String.valueOf(MusInstrEncr);
        String MusInstrDecr=textdecrypt.applyCaesar1(MusInstString2,key);
        String result=MusInstrDecr;

        String expected="[MusicalInstrument{name='Guitar', quantity=35, price=780}]";

        Assert.assertEquals(expected,result);
    }
}