package headfirst.iterator.dinermerger.after;

import java.util.*;

public class MenuTestDrive{
  public static void main(String args[]){
    PancakeHouseMenu phm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    SejinMenu sm = new SejinMenu();
    
    Waitress w = new Waitress(phm,dm,sm);
    w.printMenu();
  }
}