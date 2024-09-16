package baseball.number;

import baseball.exception.*;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private List<Integer> userNumbers = new ArrayList<>();

    public void inputUserNum(String s) {
        validation(s);
        for (int i = 0; i < s.length(); i++) {
            if(userNumbers.contains(s.charAt(i)-'0')){
                throw new DuplicateNumberException();
            }
            userNumbers.add(s.charAt(i) - '0');
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    private void validation(String s){
        if(s.length()!=3){
            throw new InvalidNumberLengthException();
        }
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                throw new InvalidDigitException();
            }
        }
    }
}
