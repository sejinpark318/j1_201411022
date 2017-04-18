package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza {
  public PotatoPizza() {
    name = "Potato Pizza";
    dough = "Regular Crust";
    sauce = "Tomato Sauce";
    toppings.add("Bacon");
    toppings.add("Sliced Potatoes");
    toppings.add("Sliced black olives");
    toppings.add("Mozzarella cheese");
  }
}
