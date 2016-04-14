package CollectionMusicInstrument;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class EncryptionTest {

    @Test
    public void testMain() throws Exception {
        List<MusicalInstrument> musicalInstrumentListForEncryption = new ArrayList<>();
        musicalInstrumentListForEncryption.add(new Guitar("Guitar",  35, 780));
        int key =1;

        EnglishCesarEncrypt textencrypt = new EnglishCesarEncrypt();
        String  MusInstrString=String.valueOf(musicalInstrumentListForEncryption);
        String result = textencrypt.applyCaesar(MusInstrString, key);

       String expected= "\\NvtjdbmJotusvnfou|obnf>(Hvjubs(-!rvboujuz>46-!qsjdf>891~^";

        Assert.assertEquals(expected,result);
    }
}