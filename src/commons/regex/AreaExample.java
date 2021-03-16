package commons.regex;

import commons.InvalidException;

public class AreaExample {
    public void validate(double area) throws InvalidException {
        if (area < 30) {
            throw new InvalidException("Invalid!");
        }
    }
}
