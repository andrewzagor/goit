package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class DistanceToPointTest {

    @Test
    public void testDistancePoint() throws Exception {
        double xa=-5;
        double xb=4;
        double ya=7;
        double yb=11;

        DistanceToPoint distanceToPoint=new DistanceToPoint();
        double result=distanceToPoint.distancePoint(xa, ya, xb, yb);

        Assert.assertEquals(sqrt(pow((xb-xa),2)+pow((yb-ya),2)), result, 0);
    }
}