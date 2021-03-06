package flowerStore;

public class FlowerPack {
    public int amount;
    public Flower flower;

    public FlowerPack(Flower flower, int amount){
        this.flower = flower;
        this.amount = amount;
    }

    public void addFlower(){
        this.amount++;
    }

    public void removeFlower() { this.amount--; }

    public double price(){
        return this.amount * this.flower.getPrice();
    }
}
