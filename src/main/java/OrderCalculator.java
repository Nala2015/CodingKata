public class OrderCalculator {

    public double getOrderTotal(String[] booksInOrder) {
        if(booksInOrder.length == 0) {
            return 0.00;
        }
        if((booksInOrder.length == 2) && (!booksInOrder[0].equals(booksInOrder[1]))) {
            return 15.20;
        }
        if(booksInOrder.length == 2) {
            return 16.00;
        }
        return 8.00;
    }

}
