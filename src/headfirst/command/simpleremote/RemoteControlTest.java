package headfirst.command.simpleremote;

public class RemoteControlTest{
  //1.r=new 2.new(r) 3.setCommand() 4.buttonPressed 5.execute()
  public static void main(String[] args){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightONCommand lightOn = new LightONCommand(light);
    LightOFFCommand lightOff = new LightOFFCommand(light);
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
    remote.setCommand(lightOff);
    remote.buttonWasPressed();
  }
  
}