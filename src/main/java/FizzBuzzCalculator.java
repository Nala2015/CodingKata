public class FizzBuzzCalculator
{
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public String calculate(int i)
    {
        StringBuilder calculation = new StringBuilder();

        if(Integer.toString(i).contains("5")) {
            calculation.append(BUZZ);
        }

        if (divisibleByThree(i) && divisibleByFive(i))
            return calculation.append(FIZZ + BUZZ).toString();

        if (divisibleByThree(i))
            return calculation.append(FIZZ).toString();

        if (divisibleByFive(i))
            return calculation.append(BUZZ).toString();

        if (calculation.toString().isEmpty())
            return Integer.toString(i);

        return calculation.toString();
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
