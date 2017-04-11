package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    this.beverage=b;
  }//black Diamond part
  public String getDescription(){
    return beverage.getDescription()+" adding Whip";
  }
  public double cost(){
    return beverage.cost()+0.1; //0.2가 decoration 추가금액
  }
}