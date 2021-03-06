package ProjectNew;

import Project.*;
import Project.ConvertFunctionToRPN;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZahornyiAI on 19.04.2016.
 */
public class RightRectangleMethodTest {
    private static   String expression="x+2";
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
    @Test
    public void testRightCornerRM() throws Exception {
        double lowerBorder=5;
        double upperBorder=10;
        int countOfSteps=2;
        CenterRectangleMethod centerRectangleMethod = new CenterRectangleMethod(expression);
        ConvertFunctionToRPN convertFunctionToRPN = new ConvertFunctionToRPN();
        Double result;
        Double deltaX = (upperBorder - lowerBorder) / countOfSteps;
        Double[] array = new Double[countOfSteps];
        array[0] = lowerBorder+deltaX;
        result = deltaX * convertFunctionToRPN.calculateIntegral(expression, array[0]);
        for (int i = 1; i<=countOfSteps-1; i++){
            array[i] = array[i-1]+ deltaX;
            result = result + deltaX * convertFunctionToRPN.calculateIntegral(expression, array[i]);

        }

        double expected=53.75;

        Assert.assertEquals(expected,result,0);
    }
}
