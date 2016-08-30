package Spring_Part_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zagor on 29.08.2016.
 */
@Configuration
public class Config {
    @Bean
    public Calculator calculator(UnaryOperationProvider unaryOperationProvider, BinaryOperationProvider binaryOperationProvider, Parser parser) {

        Calculator calculator = new Calculator();
        calculator.setBinaryOperationsSet(binaryOperationProvider.getBinaryOperations());
        calculator.setUnaryOperationsSet(unaryOperationProvider.getUnaryOperations());
        calculator.setParser(parser);

        return calculator;
    }

    @Bean
    public UnaryOperationProvider unaryOperationProvider() {
        SimpleUnaryOperationProvider simpleUnaryOperationProvider = new SimpleUnaryOperationProvider();
        simpleUnaryOperationProvider.init();

        return simpleUnaryOperationProvider;
    }

    @Bean
    public BinaryOperationProvider binaryOperationProvider() {

        SimpleBinaryOperationProvider simpleBinaryOperationProvider = new SimpleBinaryOperationProvider();
        simpleBinaryOperationProvider.init();

        return simpleBinaryOperationProvider;
    }

    @Bean
    public Parser parser() {

        OneOrTwoOperandsNormalNotationParser oneOrTwoOperandsNormalNotationParser = new OneOrTwoOperandsNormalNotationParser();
        oneOrTwoOperandsNormalNotationParser.addNewValueParser(new DoubleValueParser());
        oneOrTwoOperandsNormalNotationParser.addNewValueParser(new BinaryValueParser());

        return oneOrTwoOperandsNormalNotationParser;
    }

    @Bean
    public OneOrTwoOperandsNormalNotationParser oneOrTwoOperandsNormalNotationParser() {
        return new OneOrTwoOperandsNormalNotationParser();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
