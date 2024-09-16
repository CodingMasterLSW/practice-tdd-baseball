package baseball.number;

import baseball.exception.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private List<Integer> userNumbers = new ArrayList<>();
    private final int user_number_length = 3;

    public void inputUserNum(String s) {
        validation(s);
        for (int i = 0; i < s.length(); i++) {
            userNumbers.add(s.charAt(i) - '0');
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    private void validation(String s) {
        isValid_Length(s);
        validateUniqueDigits(s);
    }

    private void isValid_Length(String s){
        if(s.length() != user_number_length){
            throw new InvalidNumberLengthException();
        }
    }

    private void validateUniqueDigits(String s){
        Set<Integer> tmpSet = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new InvalidDigitException();
            }
            if(tmpSet.contains(ch-'0')){
                throw new DuplicateNumberException();
            }
            tmpSet.add(ch-'0');
        }

    }

}
