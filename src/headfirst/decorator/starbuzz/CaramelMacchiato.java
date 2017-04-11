package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends CondimentDecorator{
  Beverage beverage;
  public CaramelMacchiato(Beverage b){
    this.beverage=b;
  }
  public String getDescription(){
    return beverage.getDescription()+" adding CaramelMacchiato";
  }
  public double cost(){
    return beverage.cost()+0.4;
  }
}