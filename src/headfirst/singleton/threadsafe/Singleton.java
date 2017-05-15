package headfirst.singleton.threadsafe;
  //thread �̹� �������������� �������� LOCK����  
  //CPU�� �ΰ� cpu�� �ϳ��� �Ѹ� ���µ� �ΰ��� ���̽�ߵǴϱ�
public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  
  private Singleton(){
  }
  
  public static synchronized Singleton getInstance(){
  //synchronized ���� ���������� ���Լ��� �ٸ� ���� ������ ǥ���ϴ°�(�����)
    //���̸� ��������� thread�� �ΰ�����  ���ÿ�  access�ؾߵ� 
    if(uniqueInstance == null){
      System.out.println("creating...");
      uniqueInstance = new Singleton();
    }
    System.out.println("returning...");
    System.out.println("num called..."+ numCalled++); //numCalled�� static�̶� �������� Ŀ��
    return uniqueInstance;
  }
  //����� classic�̶� �ٸ��� ������.


}