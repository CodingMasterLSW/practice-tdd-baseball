package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Number {

    private List<Integer> numbers;

    public Number(){
        this.numbers = new ArrayList<>();
    }

    public void generateNumbers(int count){
        for(int i=0; i<count; i++) {
            numbers.add(Randoms.pickNumberInRange(0, 9));
        }
    }

    public int getSize() {
        return numbers.size();
    }
}
