package flowerStore;

import java.util.List;

public class Store {

    public List<Flower> Search(List<Flower> flowers, FlowerFilterSpecification filter) {
        return (List<Flower>) filter.filter(flowers);
    }
}

