package FlowerStore;

public class FlowerBucket {
    private final int limit = 10;
    private int amount = 0;
    public FlowerPack[] bucket = new FlowerPack[limit];

    public void addFlowerPack(FlowerPack flowerPack){
        if (amount < 10){
            this.bucket[amount] = flowerPack;
            amount++;
        }
        else{
            System.out.println("В мене був \"знайомий\" який на розетці на лєві номера \\" +
                    "замовляв 1000 рюкзаків Бобі-атнівор, тому будьмо реалістами, нікому \\" +
                    "не потрібно букета з 1000 жмутками квітів у магазині де є лише 3 види");
        }
    }

    public void resetBucket(){
        this.bucket = new FlowerPack[limit];
    }

     public double price(){
        double price = 0;
        for (FlowerPack flowerPack: this.bucket){
            price += flowerPack.price();
        }
        return price;
    }
}
