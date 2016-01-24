package kata.tdd.stringcalculator;

public class StringCalculator {
    public String calculate(String value) {
        if(!isCompatible(value)) return null;
        else if(isAnAddition(value)) {
            String[] summands = value.split("\\+");
            Integer summand1 = Integer.parseInt(summands[0]);
            Integer summand2 = Integer.parseInt(summands[1]);
            return Integer.toString(summand1 + summand2);
        }
        //Y esto va empezando a coger una pinta de patrón estrategia que pa qué...
        return value;
    }

    private boolean isAnAddition(String value) {
        return value.contains("+");
    }

    private boolean isCompatible(String value) {
        return (value != null && !value.isEmpty());
    }
}
