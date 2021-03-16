package commons.regex;


import commons.InvalidException;

public class MaxNumberPeopleExample {
    public void validate(int number) throws InvalidException {
        if (number > 20 && number <= 0) {
            throw new InvalidException("Invalid!");
        }
    }
}
