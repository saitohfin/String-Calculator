package kata.tdd.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

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
    @Test
    public void hasEmptyInputReturnsNull(){
        //Arrange
        final String input = "";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertNull("The result should be null", result);
    }

}
