package ProjectNew;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 19.04.2016.
 */
@RunWith(value = Parameterized.class)
public class ConvertFunctionToRPNTest {
    final ConvertFunctionToRPN convertFunctionToRPN = new ConvertFunctionToRPN();
    private String expression;
    private String expectedExpression;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {"sin(x)", "x sin"},
                        {"l","l"},
                        {"1/sin(x)^2","1 / x 2 ^ sin"}
                }
        );

    }

    public ConvertFunctionToRPNTest(String expression, String expectedExpression) {
        this.expression = expression;
        this.expectedExpression = expectedExpression;
    }

    @Test
    public void conversionToRPN() throws Exception {
        Assert.assertEquals(convertFunctionToRPN.conversionToRPN(expression, convertFunctionToRPN.OPERATORS), expectedExpression);
    }


    }
