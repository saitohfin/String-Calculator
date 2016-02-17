package kata.tdd.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    List<IOperator> operators;

    public StringCalculator(){
        operators = Arrays.asList(new Sumator(), new Substractor(), new Multiplicator(), new Divider());
    }

    public String calculate(String value) {
        if(!isCompatible(value)) return null;

        Double result = 0.0;
        List<String> operands = new ArrayList<String>();
        String operand = "";
        IOperator operator = null;
        char[] chars = value.toCharArray();
        for(char character : chars){
            if(isAnOperator(character)){
                operands.add(operand);
                operand = "";

                if(operands.size() == 2){
                    result = operator.calculate(Double.parseDouble(operands.get(0)), Double.parseDouble(operands.get(1)));
                    operands.clear();
                    operands.add(result.toString());
                }
                operator = extractOperator(character);
            }else{
                operand += character;
            }
        }
        operands.add(operand);
        if(operands.size() == 2){
            result = operator.calculate(Double.parseDouble(operands.get(0)), Double.parseDouble(operands.get(1)));
        }else{
            result = Double.parseDouble(operand);
        }
        return "" + result.intValue();
    }

    private boolean isAnOperator(char unit) {
        boolean isOperator = false;
        for(IOperator operator : operators){
            String symbol = operator.symbol();
            if(symbol.charAt(0) == unit){
                isOperator = true;
                break;
            }
        }
        return isOperator;
    }

    private IOperator extractOperator(char unit) {
        IOperator selectedOperator = null;
        for(IOperator operator : operators){
            String symbol = operator.symbol();
            if(symbol.charAt(0) == unit){
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
