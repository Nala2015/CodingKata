public class StringCalculator
{
    public int Calculate(String testString) {
        if (!testString.isEmpty()) {
            int total = 0;
            String[] testBits = testString.split(",");
            for (String bit : testBits)
                total += Integer.parseInt(bit);

            return total;
        }
        return 0;

    }
}


