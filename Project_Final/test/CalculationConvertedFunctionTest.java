package ProjectNew;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 19.04.2016.
 */
@RunWith(value = Parameterized.class)
public class CalculationConvertedFunctionTest {
    final ConvertFunctionToRPN convertFunctionToRPN = new ConvertFunctionToRPN();
    private String expression;
    private Double expectedResult;


    public CalculationConvertedFunctionTest(String expression, Double expectedResult) {
        this.expression = expression;
        this.expectedResult = expectedResult;
    }

    @Test
    public void calculateIntegral() throws Exception {
        Assert.assertEquals(convertFunctionToRPN.calculateIntegral(expression, 1d), expectedResult, 0.01);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {"sin(x)", 0.84147d},
                        {"1/sin(x)^2",0.84147d}
                }
        );
    }
}