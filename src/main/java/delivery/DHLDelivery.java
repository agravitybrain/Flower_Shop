package delivery;

import flowerStore.Item;

import java.util.List;

public class DHLDelivery implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        if (items.isEmpty()){
            return false;
        } else {
            System.out.println("DHL delivery");
            return true;
        }
    }
}
