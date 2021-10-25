import java.util.List;

public abstract class FlowerFilterSpecification {
    public List<Flower> Filter(List<Flower> flowers) {
        return ApplyFilter(flowers);
        }
        protected abstract List<Flower> ApplyFilter(List<Flower> flowers);
}
