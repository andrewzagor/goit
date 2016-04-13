package SquareCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class CelsiusToFahrenheitTest {

    @Test
    public void testFahrenheitTemperature() throws Exception {
        double degreeCelsius=40;

        CelsiusToFahrenheit celsiusToFahrenheit=new CelsiusToFahrenheit();
        double result = celsiusToFahrenheit.fahrenheitTemperature(degreeCelsius);

        Assert.assertEquals(degreeCelsius * 9 / 5 + 32, result, 0);
    }
}