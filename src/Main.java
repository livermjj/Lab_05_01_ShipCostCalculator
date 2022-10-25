public class Main {
    public static void main(String[] args) {

        double itemPrice = 120;
        final double SALES_TAX = 1.02;
        double totalPrice = 0;

        System.out.println("Enter the Item Price: " + itemPrice);

        if (itemPrice < 100){
            totalPrice = itemPrice * SALES_TAX;
        }
        else{
            totalPrice = itemPrice;
        }

        System.out.println("Your total price is $" + totalPrice + ".");
    }
}