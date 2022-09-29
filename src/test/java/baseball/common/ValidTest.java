package baseball.common;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * author : hyeongju
 * date : 2022.09.28
 * description : 입력받은 문자열이 유효한 값인지 검증한다.
 */
public class ValidTest {

    @DisplayName("숫자 1,2인지 검증 실패 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"","0","3"})
    void commandNumber1or2FailTest(String command){
        assertTrue(!Valid.isCommandValid(command));
    }

    @DisplayName("숫자 1,2인지 검증")
    @ParameterizedTest
    @ValueSource(strings = {"1","2"})
    void commandNumber1or2Test(String command){
        assertTrue(Valid.isCommandValid(command));
    }

}
