package Spring_Part_1;

/**
 * Created by zagor on 29.08.2016.
 */
public class PlusOperation implements BinaryOperation {
    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 + operand2;
    }

    @Override
    public char getOperator() {
        return '+';
    }
}
