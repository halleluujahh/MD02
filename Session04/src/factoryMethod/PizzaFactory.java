package factoryMethod;

public class PizzaFactory {
    public enum PizzaType
    {
        HamMushroom, Deluxe, Seafood
    }
    public static IPizza createPizza(PizzaType pizzaType)
    {
        IPizza pizza = null;
        switch (pizzaType)
        {
            case HamMushroom:
                pizza = new HamAndMushroomPizza();
                break;
            case Deluxe:
                pizza = new DeluxePizza();
                break;
            default:
                System.out.println("Not a valid pizza type");
        }
        return pizza;
    }

    public static void main(String[] args) {
        IPizza pizza = PizzaFactory.createPizza(PizzaType.Deluxe);
        System.out.println(pizza.getPrice());
    }
}
