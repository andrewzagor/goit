package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class RectangleSquareTest {

    @Test
    public void testRectangle() throws Exception {
              double side1=8;
              double side2=7;
        RectangleSquare rectangleSquare=new RectangleSquare();
        double result=rectangleSquare.rectangle(side1,side2);

        Assert.assertEquals(56,result,0);
    }
}