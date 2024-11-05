package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYear1Test {
    private LeapYear ly;

    @BeforeEach
    public void initialize() {
        ly = new LeapYear();
    }

    @Test
    public void leapYearsNonCenturial() {
        boolean result = ly.isLeapYear(2016);

        Assertions.assertTrue(result);
    }

    @Test
    public void centurialLeapYears() {
        boolean result = ly.isLeapYear(1600);

        Assertions.assertTrue(result);
    }

    @Test
    public void centurialNonLeapYears() {
        boolean result = ly.isLeapYear(1700);

        Assertions.assertFalse(result);
    }

    @Test
    public void nonLeapYears() {
        boolean result = ly.isLeapYear(2023);

        Assertions.assertFalse(result);
    }
}
