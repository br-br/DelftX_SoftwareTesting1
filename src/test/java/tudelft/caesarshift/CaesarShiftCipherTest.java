package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
//    public static final String[] TEST_CASES = new String[] {"abc,5,fgh", "fgh,-5,abc", "abc,0,abc", "bcde,-5,wxyz", "wxyz,5,bcde",};

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource(value = {"abc,5,fgh", "abc,31,fgh", "abc,-26,abc", "fgh,-5,abc", "abc,0,abc", "bcde,-5,wxyz", "wxyz,5,bcde", "a b c,5,f g h"})
    public void caesarShiftCipherTests(String input, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(input, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
