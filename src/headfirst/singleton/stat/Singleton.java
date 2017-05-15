package headfirst.singleton.stat;
 //eager instantiation
public class Singleton{

  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton(){
  }
  
  public static Singleton getInstance(){
   // if(uniqueInstance == null){//�̹� new�� ��������־ creating�� �����������
   //   System.out.println("creating...");
   //   uniqueInstance = new Singleton();
   // }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled�� static�̶� �������� Ŀ��
    return uniqueInstance;
  }
  //thread �̹� �������������� �������� LOCK����  
  //CPU�� �ΰ� cpu�� �ϳ��� �Ѹ� ���µ� �ΰ��� ���̽�ߵǴϱ�


}