import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest
{
    @Test
    public void testCalculateMethodReturns1WhenInputIs1()
    {
        FizzBuzzCalculator sut = new FizzBuzzCalculator();
        String expected = "1";

        String actual = sut.calculate(1);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"2,'2'",
                "4,'4'",
                "8,'8'",
                "7,'7'"})
    public void testCalculateMethodReturnsNumberWhenNotDivisibleByThreeOrFive(int input, String expected)
    {
        FizzBuzzCalculator sut = new FizzBuzzCalculator();

        String actual = sut.calculate(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"3,'Fizz'",
                "6,'Fizz'"})
    public void testCalculateMethodReturnsFizzWhenDivisibleByThree(int input, String expected)
    {
        FizzBuzzCalculator sut = new FizzBuzzCalculator();

        String actual = sut.calculate(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"5,'Buzz'",
            "10,'Buzz'"})
    public void testCalculateMethodReturnsBuzzWhenDivisibleByFive(int input, String expected)
    {
        FizzBuzzCalculator sut = new FizzBuzzCalculator();

        String actual = sut.calculate(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"15,'FizzBuzz'",
            "30,'FizzBuzz'"})
    public void testCalculateMethodReturnsFizzBuzzWhenDivisibleByFiveAndThree(int input, String expected)
    {
        FizzBuzzCalculator sut = new FizzBuzzCalculator();

        String actual = sut.calculate(input);

        assertEquals(expected, actual);

    }

    @Test
    public void testHundredLinesGenerated()
    {
        NumberGenerator sut = new NumberGenerator(new FizzBuzzCalculator());
        int expected = 100;

        String result = sut.oneToHundred();
        int actual = result.split(System.lineSeparator()).length;

        System.out.println(result);
        assertEquals(expected,actual);

    }

    


}