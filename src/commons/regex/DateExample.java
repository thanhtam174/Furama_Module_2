package commons.regex;

import commons.InvalidException;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String FREESERVICE_REGEX ="^([0-2][1-9]|3[01])/([0][1-9]|[1][0-2])/[0-9]{4}$";

    public DateExample(){
        pattern=Pattern.compile(FREESERVICE_REGEX);
    }

    public boolean isLessThan18(String date){
        String dateArr[]=date.split("/");
        if(Year.now().getValue() - Integer.parseInt(dateArr[2]) < 18 || Integer.parseInt(dateArr[2]) < 1900){
            return true;
        }
        return false;
    }

    public void validate (String date) throws InvalidException {
        matcher=pattern.matcher(date);
        if (!matcher.matches() || isLessThan18(date)){
            throw new InvalidException("Invalid!");
        }
    }
}
