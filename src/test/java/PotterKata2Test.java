import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotterKata2Test {

    @Test
    public void anEmptyOrderReturnsZero() {
        OrderCalculator sut = new OrderCalculator();
        String[] booksInOrder = {};
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 0);
    }

    @Test
    public void oneBookInOrderReturnsUnitPrice() {
        OrderCalculator sut = new OrderCalculator();
        String[] booksInOrder = {"One"};
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 8);
    }

    @Test
    public void twoDifferentBooksReturnsFivePercentOff() {
        OrderCalculator sut = new OrderCalculator();
        String[] booksInOrder = {"One", "Two"};
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 15.20);
    }

    @Test
    public void twoOfTheSameBookReturnsUnitPriceTimesTwo() {
        OrderCalculator sut = new OrderCalculator();
        String[] booksInOrder = {"One", "One"};
        double orderAmount = sut.getOrderTotal(booksInOrder);
        assertEquals(orderAmount, 16.00);
    }
}
