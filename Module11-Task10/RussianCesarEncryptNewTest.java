package ReaderFile;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class RussianCesarEncryptNewTest {

    @Test
    public void testEncrypt() throws Exception {
          String text="Черноморецчемпион";
          int key=3;

        RussianCesarEncryptNew textencrypt=new RussianCesarEncryptNew();
        String result = textencrypt.encrypt(text, key );

        String excpected="Ъиурспсуищъиптлср";

        Assert.assertEquals(excpected, result);
    }
}