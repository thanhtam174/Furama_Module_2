package commons.regex;


import commons.InvalidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FreeServiceExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String FREESERVICE_REGEX ="^(massage|karaoke|food|drink|car)$";

    public FreeServiceExample(){
        pattern=Pattern.compile(FREESERVICE_REGEX);
    }

    public void validate (String regex) throws InvalidException {
        matcher=pattern.matcher(regex);
        if (!matcher.matches()){
            throw new InvalidException("Invalid!");
        }
    }
}
