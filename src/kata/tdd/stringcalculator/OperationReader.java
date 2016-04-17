package kata.tdd.stringcalculator;

import java.util.Arrays;
import java.util.List;

public class OperationReader {
    private final String input;
    private Integer position;
    private List<IOperator> operators;

    public OperationReader(final String input) {
        this.input = input;
        position = 0;
        operators = Arrays.asList(new Sumator(), new Substractor(), new Multiplicator(), new Divider());
    }

    public String nextValue() {
        StringBuilder builder = new StringBuilder();
        appendOperator(builder);
        final boolean emptyBuilder = builder.length() == 0;
        if(emptyBuilder){
            appendDigits(builder);
        }
        return builder.toString();
    }

    public boolean isFinished() {
        return position >= input.length();
    }

    private void appendOperator(StringBuilder builder) {
        if(isFinished()) return;

        final char character = input.charAt(position);
        if(isAnOperator(character)){
            builder.append(character);
            position++;
        }
    }

    private void appendDigits(StringBuilder builder) {
        while(!isFinished()){
            final char character = input.charAt(position);
            if(Character.isDigit(character)){
                builder.append(character);
                position++;
            }else{
                break;
            }
        }
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
}
