import java.util.List;

public class ColorFilterSpecification implements FlowerFilterSpecification {
    private FlowerColor flowerColor;

    public ColorFilterSpecification(FlowerColor flowerColor) {
        this.flowerColor = flowerColor;
    }

    @Override
    protected List<Flower> ApplyFilter(List<Flower> flowers) {
        for (Flower flower : flowers) {
            if (flowerColor.equals(flower.getColor())){ yield return (List<Flower>) flower};
        }
    }
}

