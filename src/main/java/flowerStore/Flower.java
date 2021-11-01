package flowerStore;

import lombok.Setter;
import lombok.Getter;

import java.util.Arrays;

@Getter @Setter
public class Flower extends Item{
    private FlowerType flowerType;
    private byte[] Color;
    private double price;
    private double sepalLength;

    public Flower(FlowerType flowerType, byte[] color, double price, double sepalLength){
        setColor(color);
        setFlowerType(flowerType);
        setPrice(price);
        setSepalLength(sepalLength);
    }

    public void setColor(byte[] color) {
        Color = Arrays.copyOf(color, color.length);
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return this.getFlowerType().toString();
    }
}
