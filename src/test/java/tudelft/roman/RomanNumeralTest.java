package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithInvalidSubtractor() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VL");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithInvalidChars() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("LOVE");
        Assertions.assertEquals(-1, result);
    }

    // stopped adding tests here and added them to the RomanNumeralTestWithBeforeEach class instead
}
