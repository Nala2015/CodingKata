import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotterKata2Test
{

    @Test
    public void anEmptyOrderReturnsZero()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 0);
    }

    @Test
    public void oneBookInOrderReturnsUnitPrice()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 8);
    }

    @Test
    public void twoDifferentBooksReturnsFivePercentOff()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("Two");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 15.20);
    }

    @Test
    public void twoOfTheSameBookReturnsUnitPriceTimesTwo()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("One");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 16.00);
    }

    @Test
    public void fiveDifferentBooksReturn25PercentOff()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("Two");
        booksInOrder.add("Three");
        booksInOrder.add("Four");
        booksInOrder.add("Five");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 30.00);
    }

    @Test
    public void threeDifferentBooksReturn10PercentOff()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("Two");
        booksInOrder.add("Three");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 21.60);
    }

    @Test
    public void fourDifferentBooksReturn20PercentOff()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("Two");
        booksInOrder.add("Three");
        booksInOrder.add("Four");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 25.60);
    }

    @Test
    public void orderingOneUniqueBookAndTwoDuplicateBooksReturnsDiscountOf5Percent()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("One");
        booksInOrder.add("Three");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 23.20);
    }

    @Test
    public void orderingTwoSetsOfTwoAndGettingTwoTimes5PercentDiscount()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("One");
        booksInOrder.add("Three");
        booksInOrder.add("Three");
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 30.4);
    }

    @Test
    public void testingThreeTimesTwoCopiesPlusTwoUniqueOnes()
    {
        OrderCalculator sut = new OrderCalculator();
        ArrayList<String> booksInOrder = new ArrayList<>();
        booksInOrder.add("One");
        booksInOrder.add("One");
        booksInOrder.add("Second");
        booksInOrder.add("Second");
        booksInOrder.add("Three");
        booksInOrder.add("Three");
        booksInOrder.add("Four");
        booksInOrder.add("Five");
        double orderAmount = sut.getOrderTotal(booksInOrder);

        assertEquals(51.20,orderAmount);
    }





}
