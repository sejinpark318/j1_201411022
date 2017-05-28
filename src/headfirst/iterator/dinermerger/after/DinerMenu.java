package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenu implements Menu{
  MenuItem[] menuItems;//dinermenu has alot of menuitem so use array
  static final int MAX_ITEMS = 3;//final은 못고침
  int numberOfItems=0;
  
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("BLT","Bacon, Lettuce, Tomato", false, 2.99);
    addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    if(numberOfItems >= MAX_ITEMS){
      System.out.println("Sorry, menu is full! Can't add item to menu");
    }else{
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
      }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);
  }
}