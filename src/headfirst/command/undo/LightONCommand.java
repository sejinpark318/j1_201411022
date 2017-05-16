package headfirst.command.undo;

public class LightONCommand implements Command{
  Light light;
  int level;
  public LightONCommand(Light light){
    this.light=light;
  }
  public void execute(){
    level = light.getLevel();//���� �������� ����
    light.on();
  }
  public void undo(){
    light.dim(level);
    //���� ���������� �����س��� �װ� �� dim�� ���ư��� �Լ� ���ư��°ɷ� ����
  }
}