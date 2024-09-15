package baseball.number;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenerateNumberTest {

    @DisplayName("숫자 3개 생성하기")
    @Test
    void generate_3_number(){
        Number number = new Number();
        number.generateNumbers();
        assertThat(number.getSize()).isEqualTo(3);

    }


}
