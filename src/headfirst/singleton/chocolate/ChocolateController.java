package headfirst.singleton.chocolate;

public class ChocolateController{
  public static void main(String args[]){
    ChocolateBoiler b1 = ChocolateBoiler.getInstance();
    System.out.println("It's about b1 : ");
    b1.fill();
    b1.boil();
    b1.drain();
    ChocolateBoiler b2 = ChocolateBoiler.getInstance();
    System.out.println("It's about b2 : " );
    b2.fill();
    b2.boil();
    b2.drain();
    ChocolateBoiler b3 = ChocolateBoiler.getInstance();
    System.out.println("It's about b3 : ");
    b3.fill();
    b3.boil();
    b3.drain();
  }
}