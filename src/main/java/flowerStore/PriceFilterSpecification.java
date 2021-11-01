package flowerStore;

import java.util.ArrayList;
import java.util.List;

public class PriceFilterSpecification extends FlowerFilterSpecification{

    private double budget;

    public PriceFilterSpecification(double budget) {
        this.budget = budget;
    }

    @Override
    protected List<Flower> applyFilter(List<Flower> flowers) {
        List<Flower> filtered_flowers = new ArrayList<Flower>();

        for (Flower flower : flowers) {
            if (flower.getPrice() == budget) {
                filtered_flowers.add(flower);
            }
        }
        return filtered_flowers;
    }
}