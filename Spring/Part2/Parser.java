package Part1;

import java.util.List;

/**
 * Created by zagor on 29.08.2016.
 */
public interface Parser {
    void addNewValueParser(ValueParser valueParser);

    boolean parse(String expression);

    String getParsedExpression();

    List<Double> getOperands();

    char getOperator();
}
