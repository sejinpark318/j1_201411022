package headfirst.factory.pizzaaf.small;

public class PotatoPizza extends Pizza{
  
  PizzaIngredientFactory inFac;
  
  public PotatoPizza(PizzaIngredientFactory ingredientFac){
    name = "Chicago Style Potato Pizza";
    this.inFac = ingredientFac;
  }
  
  public void prepare(){
    System.out.println("preparing...");
    dough = inFac.createDough();
    cheese = inFac.createCheese();
    potato = inFac.createPotato();
  }
}