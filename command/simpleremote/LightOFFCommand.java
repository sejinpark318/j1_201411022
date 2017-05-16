package headfirst.command.simpleremote;

public class LightOFFCommand implements Command{
  Light light;
  public LightOFFCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.off();
    //밖에서 호츄ㅜㄹ할땐 execute만  호출하는데 실제사용은 light.on    
    //off를 쓰려면 따로class만들어줘야함
  }
}