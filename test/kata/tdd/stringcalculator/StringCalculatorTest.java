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
    public void hasNotOperationReturnsTheInput(){
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
    public void fivePlusfourReturnsNine(){
        //Arrange
        final String expected = "9";
        final String input = "5+4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the summatory isn't nine", expected, result);
    }

    @Test
    public void fiveLessfourReturnsOne(){
        //Arrange
        final String expected = "1";
        final String input = "5-4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the subtraction isn't one", expected, result);
    }

    @Test
    public void fourteenLessOneReturnsThirteen(){
        //Arrange
        final String expected = "13";
        final String input = "14-1";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the subtraction isn't thirteen", expected, result);
    }

    @Test
    public void operationWithSpacesfourteenLessOneReturnsThirteen(){
        //Arrange
        final String expected = "13";
        final String input = " 14 - 1 ";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the subtraction isn't thirteen", expected, result);
    }

    @Test
    public void fiveMultiplyfourReturnsTwenty(){
        //Arrange
        final String expected = "20";
        final String input = "5*4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the multiplication isn't twenty", expected, result);
    }

    @Test
    public void twentyDivideFourReturnsFive(){
        //Arrange
        final String expected = "5";
        final String input = "20/4";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the division isn't five", expected, result);
    }

    /**
     *  Multi-operations with the same precedence level
     */
    @Test
    public void fourPlusFiveLessThreeReturnsSix(){
        //Arrange
        final String expected = "6";
        final String input = "5 + 4 - 3";
        //Act
        String result = calculator.calculate(input);
        //Assert
        assertEquals("The result of the calculation isn't six", expected, result);
    }
}
