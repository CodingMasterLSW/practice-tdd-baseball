package baseball.number;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumberTest {

    @DisplayName("UserNumber 입력 받기 ")
    @Test
    void inputUserNum(){
        UserNumber userNumber = new UserNumber();
        userNumber.inputUserNum("123");
        assertThat(userNumber.getUserNumbers()).isNotNull();
    }


    @DisplayName("UserNumber 3자리 입력 받기 ")
    @Test
    void digit_3_inputUserNum(){
        UserNumber userNumber = new UserNumber();
        userNumber.inputUserNum("123");
        assertThat(userNumber.getUserNumbers().size()).isEqualTo(3);
    }

    @DisplayName("3자리가 아닐 경우 예외처리 발생")
    @Test
    void if_not_3_digit_throw_exception(){
        UserNumber userNumber1 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber1.inputUserNum("1234");
        });

        UserNumber userNumber2 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber2.inputUserNum("12");
        });

        UserNumber userNumber3 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber3.inputUserNum("1");
        });

        UserNumber userNumber4 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber4.inputUserNum("");
        });
    }

    @DisplayName("0~9의 숫자가 아닐 경우 예외처리 발생")
    @Test
    void not_between_0_9_number(){
        UserNumber userNumber1 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber1.inputUserNum("aaa");
        });

        UserNumber userNumber2 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber2.inputUserNum("12a");
        });

        UserNumber userNumber3 = new UserNumber();
        assertThrows(IllegalArgumentException.class, () -> {
            userNumber3.inputUserNum("78@");
        });

    }

}
