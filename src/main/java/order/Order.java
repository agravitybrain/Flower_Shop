package order;

import delivery.Delivery;
import flowerStore.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {

    List<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;


    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }

    public void setPaymentMethod(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double totalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        if (items.contains(item)){
            items.remove(item);
            return true;
        } else {
            return false;
        }
    }
}
