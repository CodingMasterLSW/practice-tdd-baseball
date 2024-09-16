package baseball.number;

import static org.assertj.core.api.Assertions.*;

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

}
