package flowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower;
    private FlowerPack pack;
    private FlowerBucket bucket;
    private int amount = 10;
    private double price = 10.56;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP, new byte[]{101, 101, 101}, price, 99);
        pack = new FlowerPack(flower, amount);
        bucket.addFlowerPack(pack);
        bucket.addFlowerPack(pack);
    }

    @Test
    void price() {
        assertEquals(2 * price * amount, bucket.price());
    }
    @Test
    void getDescription() {
        assertEquals("This is bucket it costs" + bucket.price(), bucket.getDescription());
    }
}