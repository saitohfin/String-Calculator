package kata.tdd.stringcalculator;


public interface IOperator {

    String symbol();

    Double calculate(final Double operand1, final Double operand2);
}
