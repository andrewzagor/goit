package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class TriangleSquareTest {

    @Test
    public void testTriangle() throws Exception {
         double side=8;
         double high=5;
        TriangleSquare triangleSquare=new TriangleSquare();
        double result = triangleSquare.triangle(side, high);

        Assert.assertEquals(20, result, 0);
    }
}