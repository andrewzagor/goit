package Part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zagor on 29.08.2016.
 */
@Configuration
public class Config {
    @Bean
    public Calculator calculator(BinaryOperationProvider binaryOperationProvider, Parser parser) {

        Calculator calculator = new Calculator();
        calculator.setBinaryOperationsSet(binaryOperationProvider.getBinaryOperations());
        calculator.setParser(parser);

        return calculator;
    }

    @Bean
    public BinaryOperationProvider binaryOperationProvider() {

        SimpleBinaryOperationProvider simpleBinaryOperationProvider = new SimpleBinaryOperationProvider();
        simpleBinaryOperationProvider.init();

        return simpleBinaryOperationProvider;
    }

    @Bean
    public Parser parser() {

        ParserTwoOperands oneOrTwoOperandsNormalNotationParser = new ParserTwoOperands();
        oneOrTwoOperandsNormalNotationParser.addNewValueParser(new DoubleValueParser());
        oneOrTwoOperandsNormalNotationParser.addNewValueParser(new BinaryValueParser());

        return oneOrTwoOperandsNormalNotationParser;
    }

    @Bean
    public ParserTwoOperands oneOrTwoOperandsNormalNotationParser() {
        return new ParserTwoOperands();
    }

}
