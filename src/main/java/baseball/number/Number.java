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
        int cnt = 0;
        while(cnt<count){
            int number = Randoms.pickNumberInRange(0,9);
            if(numbers.contains(number)){
                continue;
            }
            numbers.add(number);
            cnt++;
        }
    }

    public int getSize() {
        return numbers.size();
    }
    public List<Integer> getNumbers(){
        return numbers;
    }
}
