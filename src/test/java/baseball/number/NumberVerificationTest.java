package baseball.number;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberVerificationTest {


    @DisplayName("숫자 3개를 맞췄을 경우 - 0볼 3스트라이크")
    @Test
    void correct_3_number(){
        assertBallAndStrike(Arrays.asList(1,2,3), Arrays.asList(1,2,3), 0, 3);
    }

    @DisplayName("숫자 2개를 맞췄을 경우 - 0볼 2스크라이크 ")
    @Test
    void ball_0_strike_2(){
        assertBallAndStrike(Arrays.asList(1,2,4), Arrays.asList(1,2,5), 0, 2);
    }

    @DisplayName("숫자 1개를 맞췄을 경우 - 0볼 1스크라이크인 경우 ")
    @Test
    void ball_0_strike_1(){
        assertBallAndStrike(Arrays.asList(1,4,9), Arrays.asList(1,2,3), 0, 1);
    }

    @DisplayName("숫자 1개를 맞췄을 경우 - 1볼 1스크라이크인 경우 ")
    @Test
    void ball_1_strike_1(){
        assertBallAndStrike(Arrays.asList(1,3,9), Arrays.asList(1,2,3), 1, 1);
    }

    @DisplayName("숫자 1개를 맞췄을 경우 - 2볼 1스크라이크인 경우 ")
    @Test
    void ball_2_strike_1(){
        assertBallAndStrike(Arrays.asList(1,4,9), Arrays.asList(1,9,4), 2, 1);
    }

    @DisplayName("숫자 0개를 맞췄을 경우 - 0볼 0스크라이크인 경우 ")
    @Test
    void ball_0_strike_0(){
        assertBallAndStrike(Arrays.asList(1,2,3), Arrays.asList(4,5,6), 0, 0);
    }

    @DisplayName("숫자 0개를 맞췄을 경우 - 1볼 0스크라이크인 경우 ")
    @Test
    void ball_1_strike_0(){
        assertBallAndStrike(Arrays.asList(1,2,3), Arrays.asList(3,4,5), 1, 0);
    }

    @DisplayName("숫자 0개를 맞췄을 경우 - 2볼 0스크라이크인 경우 ")
    @Test
    void ball_2_strike_0(){
        assertBallAndStrike(Arrays.asList(1,2,3), Arrays.asList(2,3,6), 2, 0);
    }

    @DisplayName("숫자 0개를 맞췄을 경우 - 3볼 0스크라이크인 경우 ")
    @Test
    void ball_3_strike_0(){
        assertBallAndStrike(Arrays.asList(1,2,3), Arrays.asList(2,3,1), 3,0);
    }

    private void assertBallAndStrike(List<Integer> numbers, List<Integer> userNumbers, int expectedBalls, int expectedStrikes){
        NumberVerification numberVerification = new NumberVerification();
        int[] answer = numberVerification.compareNumber(numbers, userNumbers);
        assertThat(answer[0]).isEqualTo(expectedBalls);
        assertThat(answer[1]).isEqualTo(expectedStrikes);

    }

}
