package kata.tdd.stringcalculator;

/**
 * Created by jlalias on 13/02/16.
 */
public class Divider implements IOperator{
    @Override
    public String symbol() {
        return "/";
    }

    @Override
    public Double calculate(Double operand1, Double operand2) {
        return operand1 / operand2;
    }
}
