package headfirst.singleton.stat;
 //eager instantiation
public class Singleton{

  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton(){
  }
  
  public static Singleton getInstance(){
   // if(uniqueInstance == null){//이미 new로 만들어져있어서 creating은 절대뜨지않음
   //   System.out.println("creating...");
   //   uniqueInstance = new Singleton();
   // }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled가 static이라서 점점수가 커짐
    return uniqueInstance;
  }
  //thread 이미 누가쓰고있으면 못쓰도록 LOCK설정  
  //CPU가 두개 cpu가 하나면 한명만 쓰는데 두개면 같이써야되니까


}