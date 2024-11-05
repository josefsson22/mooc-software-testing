package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsTestJJ {

    @Test
    public void TotalIsHigherThanBars() {
        int result = new ChocolateBags().calculate(1, 1, 10);

        Assertions.assertEquals(-1, result);
    }

    @Test
    public void OnlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void BothBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void OnlySmallBars() {
        int result = new ChocolateBags().calculate(4, 3, 3);

        Assertions.assertEquals(3, result);
    }
}
