package kata.tdd.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationReaderTest {

    @Before
    public void setUp(){

    }

    @Test
    public void inputNumberRerturnNumber(){
        //Arrange
        final String expected = "12413";
        final OperationReader reader = new OperationReader(expected);
        //Act
        final String result = reader.nextValue();
        //Assert
        assertEquals("Don't returned the same value", expected, result);
    }

    @Test
    public void inputNumberWithOperatorReturnTheOperator(){
        //Arrange
        final String expected = "+";
        final String input = "12413" + expected;
        final OperationReader reader = new OperationReader(input);
        reader.nextValue();
        //Act
        final String result = reader.nextValue();
        //Assert
        assertEquals("Don't returned the operator", expected, result);
    }

    @Test
    public void inputCompleteOperationReturnSecondNumber(){
        //Arrange
        final String expected = "99";
        final String input = "12413+" + expected;
        final OperationReader reader = new OperationReader(input);
        reader.nextValue();
        reader.nextValue();
        //Act
        final String result = reader.nextValue();
        //Assert
        assertEquals("Don't returned the second value", expected, result);
    }

    @Test
    public void arriveToFinishReaderReturnEmpty(){
        //Arrange
        final String expected = "";
        final String input = "12413+" + expected;
        final OperationReader reader = new OperationReader(input);
        reader.nextValue();
        reader.nextValue();
        reader.nextValue();
        //Act
        final String result = reader.nextValue();
        //Assert
        assertEquals("Return value is not empty", expected, result);
    }
}
