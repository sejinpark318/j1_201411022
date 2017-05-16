package headfirst.command.undo;

public class DvdONCommand implements Command{
  Dvd dvd;
  int volume;
  public DvdONCommand(Dvd dvd){
    this.dvd=dvd;
  }
  public void execute(){
    volume = dvd.getVolume();
    dvd.on();
  }
  public void undo(){
    dvd.undoState(volume);
  }
}