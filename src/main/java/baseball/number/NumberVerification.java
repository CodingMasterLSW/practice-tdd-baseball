package baseball.number;

import java.util.List;

public class NumberVerification {

    private int strike;
    private int ball;

    public int[] compareNumber(List<Integer> numbers, List<Integer> userNumbers){
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) == userNumbers.get(i)){
                ++strike;
                continue;
            }
            if(userNumbers.contains(numbers.get(i))){
                ++ball;
            }
        }
        return new int[]{ball, strike};
    }

}
