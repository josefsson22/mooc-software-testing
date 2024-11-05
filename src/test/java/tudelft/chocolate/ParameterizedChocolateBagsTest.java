package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedChocolateBagsTest {

    @ParameterizedTest(name = "small={0},big={1},total={2},result={3}")
    @CsvSource({"1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1"})
    public void totalIsTooBig(int small, int big, int total, int expected) {
        int result = new ChocolateBags().calculate(small, big, total);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "small={0},big={1},total={2},result={3}")
    @CsvSource({"5,0,10,-1", "5,1,10,5", "5,2,10,0", "5,3,10,0"})
    public void OnlyBigBars(int small, int big, int total, int expected) {
        int result = new ChocolateBags().calculate(small, big, total);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "small={0},big={1},total={2},result={3}")
    @CsvSource({"4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1"})
    public void OnlySmallBars(int small, int big, int total, int expected) {
        int result = new ChocolateBags().calculate(small, big, total);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "small={0},big={1},total={2},result={3}")
    @CsvSource({"0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2"})
    public void BothBars(int small, int big, int total, int expected) {
        int result = new ChocolateBags().calculate(small, big, total);

        Assertions.assertEquals(expected, result);
    }
}
