package headfirst.iterator.dinermerger.before;
import java.util.ArrayList;


public class PancakeHouseMenu{
  //MenuItem[] menuItems;
  ArrayList menuItems;
  
  //static final int MAX_ITEMS = 3;
  //int numberOfItems=0;
  
  public PancakeHouseMenu(){
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList<MenuItem>();
    addItem("BLT","Bacon, Lettuce, Tomato", false, 2.99);
    addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    //menuItems[numberOfItems] = menuItem;
    menuItems.add(menuItem);
    //numberOfItems++;
    
  }
  //public MenuItem[] getMenuItems(){
  public ArrayList getMenuItems(){
    return menuItems;
  }
}