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

    @Test
    public void fivePlusfourReturnNine(){
        //Arrange
        final String expected = "9";
        final String input = "5+4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the summatory isn't nine", expected, result);
    }

    @Test
    public void fiveLessfourReturnOne(){
        //Arrange
        final String expected = "1";
        final String input = "5-4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the subtraction isn't one", expected, result);
    }

}
