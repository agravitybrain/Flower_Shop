package flowerStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ColorFilterSpecification extends FlowerFilterSpecification{
    private byte[] color;

    public ColorFilterSpecification(byte[] color) {
        this.color = color;
    }

    @Override
    protected List<Flower> applyFilter(List<Flower> flowers) {
        List<Flower> filtered_flowers = new ArrayList<Flower>();

        for (Flower flower : flowers) {
            if (Arrays.equals(flower.getColor(), color)) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}