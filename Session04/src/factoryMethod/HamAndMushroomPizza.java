package factoryMethod;

public class HamAndMushroomPizza implements  IPizza{
    private float price = 8.5F;
    @Override
    public float getPrice() {
        return price;
    }
}
