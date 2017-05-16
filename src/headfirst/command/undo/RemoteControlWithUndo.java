package headfirst.command.undo;

public class RemoteControlWithUndo{
  //Command slot; 버튼이 여러개라서 array쓸거임 갯수를 정할수 있으니까 array
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    onCommands = new Command[7]; 
    offCommands = new Command[7];
    Command noCommand = new NoCommand(); //NullObject Pattern
    for(int i = 0; i<7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  
  public void setCommand(int slot, Command onCommand, Command offCommand){
    //slot=c;
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }
  public void onbuttonWasPushed(int slot){
    //slot.execute();
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  public void offbuttonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
    
  }
}