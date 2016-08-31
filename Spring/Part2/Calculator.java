package Part1;

import java.util.List;

/**
 * Created by zagor on 29.08.2016.
 */
public class Calculator {
    private Parser parser;
    private List<BinaryOperation> binaryOperationsSet;

    void setBinaryOperationsSet(List<BinaryOperation> binaryOperationsSet) {
        this.binaryOperationsSet = binaryOperationsSet;
    }

    void setParser(Parser parser) {
        this.parser = parser;
    }

    public double compute(String expression) throws IllegalArgumentException {

        boolean operatorFound = false;
        double result = 0;
        parser.parse(expression);

        for (BinaryOperation binaryOperation : binaryOperationsSet) {
            if (binaryOperation.getOperator() != parser.getOperator()) {
                continue;
            }
            operatorFound = true;
            result = binaryOperation.calculate(parser.getOperands().get(0), parser.getOperands().get(1));
        }

        if (!operatorFound) {
            throw new IllegalArgumentException("Operator not found: '" + parser.getOperator() + "'");
        }

        return result;
    }

    public void addNewBinaryOperation(BinaryOperation binaryOperation) {

        binaryOperationsSet.add(binaryOperation);
    }

    public void addNewValueParser(ValueParser valueParser) {

        parser.addNewValueParser(valueParser);
    }
}
