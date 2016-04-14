package Massive;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 14.04.2016.
 */
public class PuzirekTest {

    @Test
    public void testMain() throws Exception {
        int[] mas1 = {435, 958, 324, 675, 857, 123, 215, 375, 656, 585};
        Puzirek puzirek=new Puzirek(mas1);
        String intArrayStringPuzirek;
        intArrayStringPuzirek = Arrays.toString(mas1);

        int[] mas2 = new int [] {123, 215, 324, 375, 435, 585, 656, 675, 857, 958};
        String intArrayStringExpected;
        intArrayStringExpected=Arrays.toString(mas2);

        Assert.assertEquals(intArrayStringExpected,intArrayStringPuzirek);

        }
    }
