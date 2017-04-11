package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage{
  //description = "House blend coffee";
  public HouseBlend(){
    description = "House blend coffee";
  }
  /*public String getDescription(){
    return description;
  }*/
  
  //public abstract double cost();
  public double cost(){
    return 0.89;
  }
}