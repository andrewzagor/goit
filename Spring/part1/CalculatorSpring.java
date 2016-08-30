package Spring_Part_1;


/**
 * Created by zagor on 29.08.2016.
 */
public class CalculatorSpring {
    public static Calculator getCalculator(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleCalculator-context.xml", "simpleCalculator-aop-context.xml");

        return applicationContext.getBean("calculator", Calculator.class);
    }
}
