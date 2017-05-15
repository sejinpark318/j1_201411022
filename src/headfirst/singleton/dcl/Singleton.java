package headfirst.singleton.dcl;
  //thread �̹� �������������� �������� LOCK����  
  //CPU�� �ΰ� cpu�� �ϳ��� �Ѹ� ���µ� �ΰ��� ���̽�ߵǴϱ�
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
      }//singleton class ����ȭ �ɱ� ������̶��  �ɱ�
      
    }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled�� static�̶� �������� Ŀ��
    return uniqueInstance;
  }
  //����� classic�̶� �ٸ��� ������.


}