package delivery;

import flowerStore.Flower;
import flowerStore.FlowerType;
import flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryTest {
    DHLDelivery deliveryMethod;
    Flower flower;
    List<Item> items;

    @BeforeEach
    void setUp() {
        deliveryMethod = new DHLDelivery();
        flower = new Flower(FlowerType.TULIP, new byte[] {101, 101, 101}, 10, 99);
        items = new ArrayList<Item>();
    }

    @Test
    void deliver() {
        assertEquals(false, deliveryMethod.deliver(items));
        items.add(flower);
        assertEquals(true, deliveryMethod.deliver(items));
    }
}