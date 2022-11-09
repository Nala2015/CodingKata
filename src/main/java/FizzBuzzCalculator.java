public class FizzBuzzCalculator
{
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public String calculate(int i)
    {

        if (divisibleByThree(i) && divisibleByFive(i))
            return FIZZ + BUZZ;
        if (divisibleByThree(i))
            return FIZZ;

        if (divisibleByFive(i))
            return BUZZ;

        return Integer.toString(i);

    }

    private boolean divisibleByThree(int i)
    {
        return i % 3 == 0;
    }

    private boolean divisibleByFive(int i)
    {
        return i % 5 == 0;
    }


}
