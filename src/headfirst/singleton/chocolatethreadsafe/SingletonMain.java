package headfirst.singleton.chocolatethreadsafe;

public class SingletonMain {
 public static void main(String[] args) {
  ChocolateBoiler singleton1 = ChocolateBoiler.getInstance();
  singleton1.fill();
  singleton1.boil();
  singleton1.drain();
  
  ChocolateBoiler singleton2 = ChocolateBoiler.getInstance();
  singleton2.fill();
  singleton2.boil();
  singleton2.drain();
  ChocolateBoiler singleton3 = ChocolateBoiler.getInstance();
  singleton3.fill();
  singleton3.boil();
  singleton3.drain();
  
 }
}