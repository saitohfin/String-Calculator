package kata.tdd.stringcalculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    List<IOperator> operators;

    public StringCalculator(){
        operators = Arrays.asList(new Sumator(), new Substractor(), new Multiplicator(), new Divider());
    }

    public String calculate(String value) {
        if(!isCompatible(value)) return null;

        IOperator operator = extractOperator(value);
        if(operator != null){
            String[] operands = value.split("\\" + operator.symbol());
            Double operand1 = Double.parseDouble(operands[0]);
            Double operand2 = Double.parseDouble(operands[1]);
            Double result = operator.calculate(operand1, operand2);
            return "" + result.intValue();
        }
        return value;
    }

    private IOperator extractOperator(String value) {
        IOperator selectedOperator = null;
        for(IOperator operator : operators){
            String symbol = operator.symbol();
            if(value.contains(symbol)){
                selectedOperator = operator;
                break;
            }
        }
        return selectedOperator;
    }

    private boolean isCompatible(String value) {
        return (value != null && !value.isEmpty());
    }
}
