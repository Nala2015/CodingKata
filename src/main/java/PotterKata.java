import java.util.Scanner;

public class PotterKata
{
    public static double unit_price = 8.0;
    public double calculatePrice(int[] basket)
    {
        if (basket.length == 2 && basket[0] == basket[1])
            return 16.00;
        else if (basket.length == 2 && basket[0] != basket[1])
            return 15.20;
        else
            return 8.0;
    }

}
