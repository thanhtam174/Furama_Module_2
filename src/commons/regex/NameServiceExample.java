package commons.regex;

import commons.InvalidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameServiceExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX="^[A-Z]+[a-z0-9]+$";

    public NameServiceExample(){
        pattern=Pattern.compile(NAME_REGEX);
    }

    public void validate (String name) throws InvalidException {
        matcher=pattern.matcher(name);
        if (!matcher.matches()){
            throw new InvalidException("Invalid!");
        }
    }
}
