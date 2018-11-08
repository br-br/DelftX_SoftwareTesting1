package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithInvalidSubtractor() {
        int result = roman.convert("VL");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithDoubleSubtractor() {
        int result = roman.convert("XXL");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithInvalidChars() {
        int result = roman.convert("LOVE");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithInvalidSequence() {
        int result = roman.convert("LM");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithFourOfAKind() {
        int result = roman.convert("XXXX");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void numberWithManyOfAKind() {
        int result = roman.convert("CCCCCC");
        Assertions.assertEquals(-1, result);
    }
}
