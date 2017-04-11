package headfirst.decorator.starbuzz;

public class StarbuzzCoffee{
  public static void main(String args[]){
    Beverage beverage = new HouseBlend();
    beverage = new Mocha(beverage);
    beverage = new CaramelMacchiato(beverage);
    beverage = new Whip(beverage);
    
    System.out.println(beverage.getDescription() +"$" + beverage.cost());
    
    
  }
}