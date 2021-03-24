package commons.regex;

import commons.InvalidException;

public class GenderExample {
    public String validate(String regex) throws InvalidException {
        String[] genderList = {"Male","Female","Unknow"};
        boolean isValid = false;
        String temp = null;
        for (String gender:genderList) {
            if (regex.compareToIgnoreCase(gender) == 0){
                isValid = true;
                temp = gender;
            }
        }
        if (!isValid){
            throw new InvalidException("Invalid");
        }
        return temp;
    }
}
