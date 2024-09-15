package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Number {

    private static final int NUMBER_COUNT = 3;

    private List<Integer> numbers = new ArrayList<>();

    public Number(){
        generateNumbers(NUMBER_COUNT);
    }

    private void generateNumbers(int count){
        for(int i=0; i<count; i++) {
            numbers.add(Randoms.pickNumberInRange(0, 9));
        }
    }

    public int getSize() {
        return numbers.size();
    }
}
