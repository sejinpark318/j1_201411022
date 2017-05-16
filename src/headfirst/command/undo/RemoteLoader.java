package headfirst.command.undo;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light();
    Dvd dvd = new Dvd();
    LightONCommand lighton = new LightONCommand(light);
    LightOFFCommand lightoff = new LightOFFCommand(light);
    DvdONCommand dvdon = new DvdONCommand(dvd);
    DvdOFFCommand dvdoff = new DvdOFFCommand(dvd);
    remote.setCommand(2,lighton,lightoff);
    remote.onbuttonWasPushed(2);
    remote.offbuttonWasPushed(2);
    remote.undoButtonWasPushed();
    remote.offbuttonWasPushed(2);
    remote.onbuttonWasPushed(2);
    remote.undoButtonWasPushed();
    
    remote.setCommand(3,dvdon,dvdoff);
    remote.onbuttonWasPushed(3);
    remote.offbuttonWasPushed(3);
    remote.undoButtonWasPushed();
    remote.offbuttonWasPushed(3);
    remote.onbuttonWasPushed(3);
    remote.undoButtonWasPushed();
  }
}