package payment;

public class PayWithCreditCard implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Pay with Credit card");
        return true;
    }
}
