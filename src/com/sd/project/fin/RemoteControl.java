package com.sd.project.fin;

public class RemoteControl{
  Command[] onCommands;
  
  public RemoteControl(){
    onCommands = new Command[7];
  }
  public void setCommand(int slot, Command onCommand){
    onCommands[slot]=onCommand;
  }
  public void buttonWasPressed(int slot){
    onCommands[slot].execute();
  }
}