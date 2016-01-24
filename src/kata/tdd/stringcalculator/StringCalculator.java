package kata.tdd.stringcalculator;

public class StringCalculator {
    public String calculate(String value) {
        if(!isCompatible(value)) return null;

        return value;
    }

    private boolean isCompatible(String value) {
        return (value != null && !value.isEmpty());
    }
}
