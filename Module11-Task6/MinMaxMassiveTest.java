package Massive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class MinMaxMassiveTest {

    @Test
    public void testMinVarFour() throws Exception {
        int a=45;
        int b=76;
        int c=34;
        int d=15;

        MinMaxMassive minMaxMassive=new MinMaxMassive();
        int result = minMaxMassive.minVarFour(a,b,c,d);

        Assert.assertEquals(15,result,0);
    }

    @Test
    public void testMaxVarFour() throws Exception {
        int a=45;
        int b=76;
        int c=34;
        int d=15;

        MinMaxMassive minMaxMassive=new MinMaxMassive();
        int result = minMaxMassive.maxVarFour(a,b,c,d);

        Assert.assertEquals(76, result, 0);
    }
}