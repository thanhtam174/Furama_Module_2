package commons.regex;

import commons.InvalidException;

public class NameCustomerClass {
    public void validate(String fullName) throws InvalidException {
        String[] fullNameElement = fullName.split(" ");

        for (String element:fullNameElement){
            if (Character.isLowerCase(element.charAt(0))){
                throw new InvalidException("Invalid!");
            }

            for (int i=0;i<fullName.length() - 1; i++){
                if (fullName.charAt(i) == ' ' && fullName.charAt(i+1) == ' '){
                    throw new InvalidException("Invalid!");
                }
            }
        }
    }
}
