package baseball.view;

import static baseball.view.OutputView.*;
import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OutputViewTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private OutputView outputView = new OutputView();

    @BeforeEach
    void setUp(){
        System.setOut(new PrintStream(outputStream));
    }

    @DisplayName("0볼 1스트라이크 출력 메세지 테스트")
    @Test
    void ball_0_strike_1_result_message(){
        int[] result = {0,1};
        outputView.gameResultMessage(result);
        assertThat(outputStream.toString()).isEqualTo(NOT_CONTAINS_BALL_MESSAGE, 1);
    }

    @DisplayName("1볼 1스트라이크 출력 메세지 테스트")
    @Test
    void ball_1_strike_1_result_message(){
        int[] result = {1,1};
        outputView.gameResultMessage(result);
        assertThat(outputStream.toString()).isEqualTo(RESULT_MESSAGE, 1, 1);
    }

    @DisplayName("3스트라이크 출력 메세지 테스트")
    @Test
    void ball_0_strike_3_result_message(){
        int[] result = {0,3};
        outputView.gameResultMessage(result);
        assertThat(outputStream.toString()).isEqualTo(NOT_CONTAINS_BALL_MESSAGE,3);
    }

}
