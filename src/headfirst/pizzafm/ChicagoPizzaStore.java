package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

 Pizza createPizza(String item) {
   if (item.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
   }else if (item.equals("pepperoni")) {
      return new ChicagoStylePepperoniPizza();
   } else return null;
 }
}