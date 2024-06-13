package factoryMethod;

public class DeluxePizza implements IPizza{
    private float price = 10.5F;
    @Override
    public float getPrice() {
        return price;
    }
}
