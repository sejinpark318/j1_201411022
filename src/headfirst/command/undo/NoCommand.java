package headfirst.command.undo;
//receiver�� ���� Ŀ�ǵ� object�� ���� �����ִ� ����
//�ƹ��͵� �������� ������ �ִ� �Լ��� ������ �ؾ��� �ƹ��͵� ���ϴ°ɷ�
//�ƹ��͵� ���ϴ� ��¯�� Ŀ�ǵ� nullObject Pattern
public class NoCommand implements Command{
  public void execute(){
    System.out.println("do nothing...");
  }
  public void undo(){}
}