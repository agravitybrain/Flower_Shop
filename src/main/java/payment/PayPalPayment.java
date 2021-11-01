package payment;

public class PayPalPayment implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Pay with PayPal");
        return true;
    }
}
