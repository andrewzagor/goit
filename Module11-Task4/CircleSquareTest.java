package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class CircleSquareTest {

    @Test
    public void testCircle() throws Exception {

        double radius=5;

        CircleSquare circleSquare=new CircleSquare();

        double result=circleSquare.circle(radius);

        Assert.assertEquals(25*3.14, result, 0.1);
    }
}