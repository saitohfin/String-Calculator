package kata.tdd.stringcalculator;


public class Substractor implements IOperator {
    @Override
    public String symbol() {
        return "-";
    }

    @Override
    public Double calculate(Double operand1, Double operand2) {
        return operand1 - operand2;
    }
}
