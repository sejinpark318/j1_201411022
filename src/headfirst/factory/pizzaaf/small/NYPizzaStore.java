package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
     Pizza pizza = null;
     PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
     
     if (type.equals("cheese")) {
       //pizza = new NYStyleCheesePizza();
       pizza = new CheesePizza(inFac);
       //pizza.setName("New York Style Cheese Pizza");
     }else if(type.equals("potato")){
       pizza = new PotatoPizza(inFac);
     }
     return pizza;
  }
}