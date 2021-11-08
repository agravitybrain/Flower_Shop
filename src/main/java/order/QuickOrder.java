package order;

import delivery.Delivery;
import delivery.PostDelivery;
import flowerStore.*;
import payment.PayPalPayment;
import payment.Payment;
import users.Reciever;
import users.Sender;

public enum QuickOrder {
    ROSE_BUCKET, TULIP_BUCKET, CHEMOMILE_BUCKET;

    public static Order createOrder(QuickOrder orderConstr) {

        Order order = new Order();

        Reciever receiver = new Reciever();
        Sender sender = new Sender();

        Payment payment = new PayPalPayment();
        Delivery delivery = new PostDelivery();

        Item bucket = new FlowerBucket();
        Flower flower;

        if (orderConstr == QuickOrder.ROSE_BUCKET) {

            flower = new Flower(FlowerType.ROSE new byte[] {101, 101, 101}, 15, 59);


        } else if (orderConstr == QuickOrder.TULIP_BUCKET) {

            flower = new Flower(FlowerType.TULIP, new byte[] {101, 101, 101}, 20, 30);

        } else if (orderConstr == QuickOrder.CHEMOMILE_BUCKET){
            flower = new Flower(FlowerType.CHEMOMILE, new byte[] {127, 120, 120}, 10, 45);

        } else {
            System.out.println("Its u again?");
            return order;
        }

        FlowerPack pack = new FlowerPack(flower, 10);

        // Add pack to bucket(We cast because SOLID and we need to be able to change from Item to FlowerBucket)
        ((FlowerBucket) bucket).addFlowerPack(pack);

        // Manage the order
        order.addItem(bucket);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentMethod(payment);

        return order;

    }
}
