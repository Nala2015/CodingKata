import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotterKataTest
{
    PotterKata uut = new PotterKata();

    @Test
    public void testingCalculateMethodWithOneBook()
    {
        double expectedValue = 8.0;
        int[] basket = {1};

        double actualValue = uut.calculatePrice(basket);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testingCalculateMethodWithTwoDifferentBooks()
    {
        double expectedValue = 15.20;
        int[] basket = {1,2};

        double actualValue = uut.calculatePrice(basket);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testingCalculateMethodWithTwoIdenticalBooks()
    {
        double expectedValue = 16.00;
        int[] basket = {1,1};

        double actualValue = uut.calculatePrice(basket);

        assertEquals(expectedValue, actualValue);

    }


}
