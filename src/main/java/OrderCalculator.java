import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderCalculator {

//    public double getOrderTotal(ArrayList<String> booksInOrder) {
//        List<ArrayList<String>> diverseBaskets = new ArrayList<>();
//        for (int i = 0; i < booksInOrder.size(); i++)
//        {
//            diverseBaskets.add(new ArrayList<String>());
//        }
//        for (String book : booksInOrder)
//        {
//            for (ArrayList<String> diverseBasket : diverseBaskets)
//            {
//                if (!diverseBasket.contains(book))
//                {
//                    diverseBasket.add(book);
//                    break;
//                }
//            }
//        }
//        double total = 0;
//        for (ArrayList<String> diverseBasket : diverseBaskets)
//            total += countDiverseBasket(diverseBasket);
//
//        return total;
//
//
//    }

    public double getOrderTotal(ArrayList<String> booksInOrder) {

        List<ArrayList<String>> diverseBaskets = new ArrayList<>();
        for (int i = 0; i < booksInOrder.size(); i++)
        {
            diverseBaskets.add(new ArrayList<String>());
        }

        int countOfNoneEmptyDiverseBaskets = 0;

        for (String book : booksInOrder)
        {
            double priceIncrement = 8;
            for (ArrayList<String> diverseBasket : diverseBaskets)
            {

                double priceIncrease = CalculatePriceIncrease(diverseBasket.size());
                if (!diverseBasket.contains(book) && priceIncrease < priceIncrement )
                {
                    priceIncrement = priceIncrease;
//                    countOfNoneEmptyDiverseBaskets++;
//                    diverseBasket.add(book);
//                    break;
                }
                if (priceIncrement == 8)
                {
                    diverseBaskets.get(countOfNoneEmptyDiverseBaskets).add(book);
                    countOfNoneEmptyDiverseBaskets++;
                }
                else{

                }
            }
        }
        double total = 0;
        for (ArrayList<String> diverseBasket : diverseBaskets)
            total += countDiverseBasket(diverseBasket);

        return total;


    }

    private double CalculatePriceIncrease(int diverseBasketSize){

        if (diverseBasketSize == 1)
            return 7.2;
        if (diverseBasketSize == 2)
            return 6.4;
        if (diverseBasketSize == 3)
            return 4;
        if (diverseBasketSize == 4)
            return 4.4;

        return 8.0;

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
