package headfirst.singleton.threadsafe;
  //thread 이미 누가쓰고있으면 못쓰도록 LOCK설정  
  //CPU가 두개 cpu가 하나면 한명만 쓰는데 두개면 같이써야되니까
public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  
  private Singleton(){
  }
  
  public static synchronized Singleton getInstance(){
  //synchronized 내가 쓰고있으면 요함수를 다른 팀이 못쓰게 표시하는거(사용중)
    //차이를 보고싶으면 thread를 두개만들어서  동시에  access해야됨 
    if(uniqueInstance == null){
      System.out.println("creating...");
      uniqueInstance = new Singleton();
    }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled가 static이라서 점점수가 커짐
    return uniqueInstance;
  }
  //실행시 classic이랑 다를거 없을것.


}