package commons.regex;

import commons.InvalidException;

public class PositiveIntegerExample {
    public void validate(double number) throws InvalidException {
        if (number <= 0) {
            throw new InvalidException("Invalid!");
        }
    }
}
