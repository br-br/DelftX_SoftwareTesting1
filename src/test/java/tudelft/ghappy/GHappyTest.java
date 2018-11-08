package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
//    private GHappy happy;
//    @BeforeEach
//    public void initialize(){
//        this.happy = new GHappy();
//    }
//
//    @Test
//    public void happyStart(){
//        boolean result = happy.gHappy("ggqsqsdskf");
//        Assertions.assertEquals(true, result);
//    }
//    @Test
//    public void happyMiddle(){
//        boolean result = happy.gHappy("sdqdggsdms");
//        Assertions.assertEquals(true, result);
//    }
//    @Test
//    public void happyEnd(){
//        boolean result = happy.gHappy("qsdskfdsfsgg");
//        Assertions.assertEquals(true, result);
//    }
//    @Test
//    public void happyNone(){
//        boolean result = happy.gHappy("qsqsdskfds");
//        Assertions.assertEquals(true, result);
//    }
//    @Test
//    public void happyStartPlusSingle(){
//        boolean result = happy.gHappy("ggqsqsqzdg");
//        Assertions.assertEquals(false, result);
//    }
//    @Test
//    public void happyMiddlePlusSingle(){
//        boolean result = happy.gHappy("dskfggdsgfs");
//        Assertions.assertEquals(false, result);
//    }
//    @Test
//    public void happyEndPlusSingle(){
//        boolean result = happy.gHappy("gqsqsdsfsgg");
//        Assertions.assertEquals(false, result);
//    }
//
//    @Test
//    public void happyThree(){
//        boolean result = happy.gHappy("qsqgggkfds");
//        Assertions.assertEquals(true, result);
//    }

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({ "ggqsqsdskf,true", "sdqdggsdms,true", "qsdskfdsfsgg,true", "qsqsdskfds,true", "qsqsgskfds,false",
            "ggqsqsqzdg,false", "dskfggdsgfs,false","gqsqsdsfsgg,false", "qsqgggkfds,true"})
    public void happyGTests(String input, boolean expectedResult) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }

}
