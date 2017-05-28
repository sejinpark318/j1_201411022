package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;
public class Waitress{
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;
  SejinMenu sejinMenu;
  
  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, SejinMenu sejinMenu){
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.sejinMenu = sejinMenu;
  }
  
  public void printMenu(){
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();
    Iterator sejinIterator = sejinMenu.createIterator();
    
    
    System.out.println("\t\tMENU\n--------\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
    System.out.println("\nSPECIAL SEJINMENU");
    printMenu(sejinIterator);
  }
  
  private void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}