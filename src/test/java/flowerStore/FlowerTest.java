package flowerStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        double price = 10.56;
        flower = new Flower(FlowerType.TULIP, new byte[] {101, 101, 101}, price, 99);
    }


    @Test
    void getColor() {
        assertEquals(new byte[] {101, 101, 101}, flower.getColor());
    }

    @Test
    void getPrice() {
        assertEquals(10.56, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(99, flower.getSepalLength());
    }

    @Test
    void price() { assertEquals(10.56, flower.price()); }

    @Test
    void getDescription() {assertEquals(FlowerType.TULIP.toString(), flower.getDescription()); }
}