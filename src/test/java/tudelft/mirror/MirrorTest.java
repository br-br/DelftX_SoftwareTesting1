package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource(value = {"azerty,''", "azerta,a", "azertza,az", "azereza,azereza", "azeeza,azeeza"})
    public void MirrorTests(String input, String expectedResult) {
        String result = new Mirror().mirrorEnds(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
