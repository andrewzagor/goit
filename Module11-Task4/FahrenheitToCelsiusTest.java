package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class FahrenheitToCelsiusTest {

    @Test
    public void testCelsiusTemperature() throws Exception {
        double degreeFahrenheit=12;

        FahrenheitToCelsius fahrenheitToCelsius=new FahrenheitToCelsius();
        double result = fahrenheitToCelsius.celsiusTemperature(degreeFahrenheit);

        Assert.assertEquals((degreeFahrenheit-32) * 5/9, result, 0);
    }
}