package headfirst.command.undo;
//receiver가 없는 커맨드 object를 만들어서 돌려주는 패턴
//아무것도 안하지만 가지고 있는 함수들 구현은 해야함 아무것도 안하는걸로
//아무것도 안하는 배짱이 커맨드 nullObject Pattern
public class NoCommand implements Command{
  public void execute(){
    System.out.println("do nothing...");
  }
  public void undo(){}
}