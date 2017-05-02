package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza{
public class CheesePizza extends Pizzas{
  PizzaIngredientFactroy inFac;
  public NYStyleCheesePizza(){
    name = "NY Style Sauce and Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Grated Reggiano Cheese");
  }
  public void prepare(){
    inFac.createDough();
    inFac.createCheese();
  }
}