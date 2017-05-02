package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive{
  public static void main(String[] args){
    Pizza p = null;
    PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    p = new CheesePizza(inFac);
    p.prepare();
    p.bake();
    p.cut();
    p.box();
    
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a "+pizza +"\n");
    
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Sejin ordered a "+pizza+"\n");
    
    //PizzaStore chicagoStore = new ChicagoPizzaStore();
    pizza = chicagoStore.orderPizza("potato");
    System.out.println("Sejin ordered a "+pizza+"\n");
  }
}