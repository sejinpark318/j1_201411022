package headfirst.command.undo;

public class DvdOFFCommand implements Command{
  Dvd dvd;
  int volume;
  public DvdOFFCommand(Dvd dvd){
    this.dvd=dvd;
  }
  public void execute(){
    volume = dvd.getVolume();
    dvd.off();
  }
  public void undo(){
    dvd.undoState(volume);
  }
}