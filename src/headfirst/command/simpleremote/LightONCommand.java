package headfirst.command.simpleremote;

public class LightONCommand implements Command{
  Light light;
  public LightONCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.on();
    //�ۿ��� ȣ��̤��Ҷ� execute��  ȣ���ϴµ� ��������� light.on    
    //off�� ������ ����class����������
  }
}