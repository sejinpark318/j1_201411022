package headfirst.command.undo;

public class LightONCommand implements Command{
  Light light;
  int level;
  public LightONCommand(Light light){
    this.light=light;
  }
  public void execute(){
    level = light.getLevel();//현재 조도레벨 저장
    light.on();
  }
  public void undo(){
    light.dim(level);
    //전의 조도레벨을 저장해놓고 그걸 로 dim이 돌아가는 함수 돌아가는걸로 구현
  }
}