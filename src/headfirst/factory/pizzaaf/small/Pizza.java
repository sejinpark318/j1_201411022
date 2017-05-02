package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;

public abstract class Pizza{
  String name;
  Dough dough;
  //String dough;
  //String sauce;
  Cheese cheese;
  Potato potato;
  
  //ArrayList<String> toppings = new ArrayList<String>();
  /*public void prepare() {
  
    System.out.println("Preparing..."+name); 
  }*/
  protected abstract void prepare();
  public void bake() {
    System.out.println("Baking..."+name+" using "+cheese+" & "+potato); 
  }
  public void cut() {
    System.out.println("Cutting..."+name); 
  }
  public void box() {
    System.out.println("Boxing..."+name); 
  }
}