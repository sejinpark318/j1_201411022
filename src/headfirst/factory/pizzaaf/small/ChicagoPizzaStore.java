package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
     Pizza pizza = null;
     PizzaIngredientFactory inFac = new ChicagoIngredientFactory();
     
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