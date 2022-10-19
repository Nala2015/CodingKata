import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorTest {


    @Test
    public void WhenTheStringIsEmptyReturnZero()
    {
        //arrange
        String testString = "";
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(0, response);

    }

    @Test
    public void WhenTheStringContainsTheNumber1ReturnTheNumber1()
    {
        //arrange
        String testString = "1";
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(1, response);

    }

    @Test
    public void WhenTheStringContainsNumber2ReturnNumber2()
    {
        //arrange
        String testString = "2";
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(2, response);

    }

    @ParameterizedTest
    @CsvSource({"'1',1",
        "'2', 2",
    "'5',5",
    "'57', 57"})
    public void WhenTheStringContainsOneNumberReturnThatNumber(String value, int expectedResponse)
    {
        //arrange
        String testString = value;
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(expectedResponse, response);

    }

    @ParameterizedTest
    @CsvSource({"'1,2',3",
            "'2,9', 11",
            "'5,45',50",
            "'57,43', 100"})
    public void WhenTheStringContainsAnyTwoNumbersReturnTheirSum(String testString, int expectedResult)
    {
        //arrange
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(expectedResult, response);

    }

    @ParameterizedTest
    @CsvSource({"'1,2,4,5',12",
            "'2,9,10', 21",
            "'5,45,16,16,18',100",
            "'57,43,1,1,1,1', 104"})
    public void WhenTheStringContainsAnyNumberOfNumbersReturnTheirSum(String testString, int expectedResult)
    {
        //arrange
        StringCalculator systemUnderTest = new StringCalculator();


        //act
        int response = systemUnderTest.Calculate(testString);


        //assert
        assertEquals(expectedResult, response);

    }
}
