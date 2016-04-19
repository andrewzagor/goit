package ProjectNew;

/**
 * Created by ZahornyiAI on 19.04.2016.
 */
public class AbstractRectangleMethod {
    protected ConvertFunctionToRPN convertFunctionToRPN;

    public AbstractRectangleMethod(String expression) {
        this.expression = expression;
        this.convertFunctionToRPN = new ConvertFunctionToRPN();
        this.convertFunctionToRPN.setExpression(expression);
    }

    protected String expression;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
