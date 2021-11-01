package flowerStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack pack;
    private int amount = 10;
    private double price = 10.56;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP, new byte[]{101, 101, 101}, price, 99);
        pack = new FlowerPack(flower, amount);
    }

    @Test
    void price() {
        assertEquals(price * amount, pack.price());
        pack.addFlower();
        assertEquals(price * (amount + 1), pack.price());
    }
}