package headfirst.command.simpleremote;

public class LightOFFCommand implements Command{
  Light light;
  public LightOFFCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.off();
    //�ۿ��� ȣ��̤��Ҷ� execute��  ȣ���ϴµ� ��������� light.on    
    //off�� ������ ����class����������
  }
}