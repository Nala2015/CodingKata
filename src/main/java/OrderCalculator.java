import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderCalculator {

    public double getOrderTotal(ArrayList<String> booksInOrder) {
        List<ArrayList<String>> diverseBaskets = new ArrayList<>();
        for (int i = 0; i < booksInOrder.size(); i++)
        {
            diverseBaskets.add(new ArrayList<String>());
        }
        for (String book : booksInOrder)
        {
            for (ArrayList<String> diverseBasket : diverseBaskets)
            {
                if (!diverseBasket.contains(book))
                {
                    diverseBasket.add(book);
                    break;
                }
            }
        }
        double total = 0;
        for (ArrayList<String> diverseBasket : diverseBaskets)
            total += countDiverseBasket(diverseBasket);

        return total;


    }

    public double countDiverseBasket(ArrayList<String> booksInOrder)
    {
        if(booksInOrder.size() == 0) {
            return 0.00;
        }
        else if(booksInOrder.size() == 1)
            return 8.00;
        else if (booksInOrder.size() == 2)
            return 15.2;
        else if (booksInOrder.size() == 3)
            return 21.6;
        else if (booksInOrder.size() == 4)
            return 25.6;
        else return 30;
    }

}
