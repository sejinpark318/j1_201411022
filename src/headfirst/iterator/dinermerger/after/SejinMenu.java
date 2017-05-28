package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class SejinMenu implements Menu{
  MenuItem[] menuItems;//dinermenu has alot of menuitem so use array
  static final int MAX_ITEMS = 3;//final은 못고침
  int numberOfItems=0;
  
  public SejinMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("김치전","김치밀가루 반죽을 부침", true, 5000);
    addItem("부추전","부추 밀가루 반죽을 부침",true, 4000);
    addItem("감자전","으깬감자 밀가루 반죽을 부침", true, 5000);
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