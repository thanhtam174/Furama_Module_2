package commons.regex;

import commons.InvalidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdHouseExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String ID_REGEX="^SVHO-[0-9]{4}$";

    public IdHouseExample(){
        pattern=Pattern.compile(ID_REGEX);
    }

    public void validate(String regex) throws InvalidException {
        matcher=pattern.matcher(regex);
        if (!matcher.matches()){
            throw new InvalidException("Invalid!");
        }
    }
}
