package FlowerStore;

import lombok.Setter;
import lombok.Getter;

import java.util.Arrays;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private byte[] Color;
    private double price;
    private double sepalLength;

    Flower(FlowerType flowerType, byte[] color, double price, double sepalLength){
        setColor(color);
        setFlowerType(flowerType);
        setPrice(price);
        setSepalLength(sepalLength);
    }

    public void setColor(byte[] color) {
        Color = Arrays.copyOf(color, color.length);
    }
}
