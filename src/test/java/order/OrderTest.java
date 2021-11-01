package order;

import flowerStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Item bucket = new FlowerBucket();
    Flower flower = new Flower(FlowerType.ROSE, new byte[] {101, 101, 101}, 10, 99);
    FlowerPack pack;
    Order order;

    @BeforeEach
    void setUp() {

        bucket = new FlowerBucket();
        flower = new Flower(FlowerType.ROSE, new byte[] {101, 101, 101}, 10, 99);
        pack = new FlowerPack(flower, 12);
        order = new Order();

        ((FlowerBucket) bucket).addFlowerPack(pack);

        order.addItem(bucket);
        order.addItem(flower);

    }

    @Test
    void totalPrice() {
        assertEquals(120, order.totalPrice());
    }

    @Test
    void addItem() {
        order.addItem(flower);
        assertEquals(130, order.totalPrice());
    }

    @Test
    void removeItem() {
        assertEquals(true, order.removeItem(flower));
        assertEquals(false, order.removeItem(flower));
        assertEquals(120, order.totalPrice());

    }
}