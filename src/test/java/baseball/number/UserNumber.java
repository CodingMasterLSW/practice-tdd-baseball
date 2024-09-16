package baseball.number;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private List<Integer> userNumbers = new ArrayList<>();

    public void inputUserNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            userNumbers.add(s.charAt(i) - '0');
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }
}
