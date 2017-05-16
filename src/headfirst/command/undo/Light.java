package headfirst.command.undo;

public class Light{
  int level; //가시성을 안쓰면 package private
  public Light(){
  }
  
  public void on(){
    level = 100;
    System.out.println("Light is on");
  }
  public void off(){
    level = 0;
    System.out.println("Light is off");
  }
  
  public void dim(int level){
    this.level = level;
    System.out.println("Light is dimmed to "+level+"%");
  }
  public int getLevel(){
    return level;
  }
}