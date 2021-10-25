package FlowerStore;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }
    // I didnt managed to implement filter for all categories
    public List<FlowerBucket> search(int budget) {
        List<FlowerBucket> appropriateBuckets = new ArrayList<>();
        for (FlowerBucket flowerbucket : flowerBuckets) {
            if (flowerbucket.price() < budget) {
                appropriateBuckets.add(flowerbucket);
            }
        }
        return appropriateBuckets;
    }
}

