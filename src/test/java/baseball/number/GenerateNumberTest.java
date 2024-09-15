package baseball.number;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class GenerateNumberTest {

    private final int GENERATE_NUMBER_COUNT = 3;

    @DisplayName("숫자 3개 생성하기")
    @Test
    void generate_3_number() {
        Number number = new Number();
        number.generateNumbers(GENERATE_NUMBER_COUNT);
        assertThat(number.getSize()).isEqualTo(GENERATE_NUMBER_COUNT);
    }

    @DisplayName("중복된 숫자가 있는지 검증")
    @RepeatedTest(100)
    void duplicate_number_exist(){
        Number number = new Number();
        number.generateNumbers(GENERATE_NUMBER_COUNT);
        List<Integer> numbers = number.getNumbers();
        Set<Integer> tmpNumbers = new HashSet<>(numbers);
        assertThat(tmpNumbers.size()).isEqualTo(GENERATE_NUMBER_COUNT);
    }

}
