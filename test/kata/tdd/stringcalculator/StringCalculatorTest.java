package kata.tdd.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp(){
        calculator = new StringCalculator();
    }

    @Test
    public void hasNotOperationReturnTheInput(){
        //Arrange
        final String expected = "5";
        //Act
        String result = calculator.calculate(expected);
        //Assert
        assertEquals("Hasn't returned the input value", expected, result);
    }
}
