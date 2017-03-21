package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck(){
    fb = new FlyRocketPowered();
    //fb = new FlyWithWings(); //private�̶� ����
    //setFlyBehavior(new FlyWithWings());
    qb = new Quack();
  }
  public void display(){
    System.out.println("Mallard...");
  }
}