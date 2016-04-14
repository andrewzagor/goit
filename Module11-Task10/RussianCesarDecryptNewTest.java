package ReaderFile;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class RussianCesarDecryptNewTest {

    @Test
    public void testDecrypt() throws Exception {
         String text="Ъиурспсуищъиптлср";
         int key=3;

        RussianCesarDecryptNew textdecrypt = new RussianCesarDecryptNew();
        String result = textdecrypt.decrypt(text, key);

        String excpected="Черноморецчемпион";

        Assert.assertEquals(excpected,result);
    }
}