package headfirst.singleton.dcl;
  //thread 이미 누가쓰고있으면 못쓰도록 LOCK설정  
  //CPU가 두개 cpu가 하나면 한명만 쓰는데 두개면 같이써야되니까
public class Singleton{
  private volatile static Singleton uniqueInstance; //volatile 
  private static int numCalled = 0;
  
  private Singleton(){
  }
  
  //public static synchronized Singleton getInstance(){
  public static Singleton getInstance(){
    if(uniqueInstance == null){
      synchronized(Singleton.class){
        if(uniqueInstance == null){
          System.out.println("creating...");
          uniqueInstance = new Singleton();
        }
      }//singleton class 동기화 걸기 사용중이라고  걸기
      
    }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled가 static이라서 점점수가 커짐
    return uniqueInstance;
  }
  //실행시 classic이랑 다를거 없을것.


}