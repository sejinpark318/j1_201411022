package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b){
    this.beverage=b;
  }//black Diamond part
  public String getDescription(){
    return beverage.getDescription()+" adding Mocha";
  }
  public double cost(){
    return beverage.cost()+0.2; //0.2가 decoration 추가금액
  }
}