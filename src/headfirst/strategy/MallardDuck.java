package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck(){
    fb = new FlyRocketPowered();
    //fb = new FlyWithWings(); //private이라서 에러
    //setFlyBehavior(new FlyWithWings());
    qb = new Quack();
  }
  public void display(){
    System.out.println("Mallard...");
  }
}