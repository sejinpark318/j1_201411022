package headfirst.factory.pizzaaf.small;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough(){
    return new ThickCrustDough();
  }
  public Cheese createCheese(){
    return new MozzarellaCheese();
  }
  public Potato createPotato(){
    return new SlicedPotato();
  }
}