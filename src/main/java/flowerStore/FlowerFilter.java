package flowerStore;

import java.util.List;

public class FlowerFilter {
    public List<Flower> By(List<Flower> flowers,
                           FlowerFilterSpecification
                                   filterSpecification) {
        return filterSpecification.filter(flowers);
    }

}
