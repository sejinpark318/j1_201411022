package com.sd.turtle;

import java.util.*;
import java.awt.*;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public MomTurtle(){};
  public void update(Observable o,Object arg){
    //System.out.println("update() called, count is " + ((Integer)arg).intValue()); 
    babyCurpos = ((BabyTurtle)o).myCurpos;
    //System.out.println("current pos" + babyCurpos);
    moveTo(babyCurpos);
  }
}