package headfirst.singleton.chocolatethreadsafe;
//lazy �ʿ��Ҷ� instance�������
public class ChocolateBoiler{
  private boolean empty; //encapsulation ���� ��Ű��
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static  synchronized ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      System.out.println("creating...");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++);
    return uniqueInstance;
  }
  
  public void fill(){
    if (isEmpty()){
      System.out.println("filling...");
      empty = false;
      boiled = false;
    }
  }
  public void drain(){
    if(!isEmpty()&& isBoiled()){
      System.out.println("draining...");
      //drain the boiled milk and chocolate
      empty = true;
    }
  }
  public void boil(){
    if(!isEmpty()&& !isBoiled()){
      System.out.println("boilling...");
      //bring the contents to a boil
      boiled = true;
    }
  }
  
  public boolean isBoiled(){
    return boiled;
  }
  public boolean isEmpty(){
    return empty;
  }
}