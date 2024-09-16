package baseball.number;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import baseball.exception.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserNumberTest {

    @DisplayName("UserNumber 입력 받기 ")
    @Test
    void inputUserNum(){
        UserNumber userNumber = assertTest("123");
        assertThat(userNumber.getUserNumbers()).isNotNull();
    }

    @DisplayName("UserNumber 3자리 입력 받기 ")
    @Test
    void digit_3_inputUserNum(){
        UserNumber userNumber = assertTest("123");
        assertThat(userNumber.getUserNumbers().size()).isEqualTo(3);
    }

    @DisplayName("3자리가 아닐 경우 예외처리 발생")
    @Test
    void if_not_3_digit_throw_exception(){
        assertThrows(InvalidNumberLengthException.class, () -> assertTest("1234"));
        assertThrows(InvalidNumberLengthException.class, () -> assertTest("12"));
        assertThrows(InvalidNumberLengthException.class, () -> assertTest("1"));
        assertThrows(InvalidNumberLengthException.class, () -> assertTest(""));
    }

    @DisplayName("0~9의 숫자가 아닐 경우 예외처리 발생")
    @Test
    void not_between_0_9_number(){
        assertThrows(InvalidDigitException.class, () -> assertTest("aaa"));
        assertThrows(InvalidDigitException.class, () -> assertTest("12a"));
        assertThrows(InvalidDigitException.class, () -> assertTest("78@"));
    }

    @DisplayName("중복된 숫자가 있을 경우 예외처리 발생")
    @Test
    void contains_equals_number(){
        assertThrows(DuplicateNumberException.class, () -> assertTest("111"));
        assertThrows(DuplicateNumberException.class, () -> assertTest("122"));
        assertThrows(DuplicateNumberException.class, () -> assertTest("992"));
        assertThrows(DuplicateNumberException.class, () -> assertTest("088"));
        assertThrows(DuplicateNumberException.class, () -> assertTest("101"));
    }

    private UserNumber assertTest(String s){
        UserNumber userNumber = new UserNumber();
        userNumber.inputUserNum(s);
        return userNumber;
    }

}
