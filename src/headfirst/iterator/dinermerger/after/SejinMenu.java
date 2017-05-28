package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class SejinMenu implements Menu{
  MenuItem[] menuItems;//dinermenu has alot of menuitem so use array
  static final int MAX_ITEMS = 3;//final�� ����ħ
  int numberOfItems=0;
  
  public SejinMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("��ġ��","��ġ�а��� ������ ��ħ", true, 5000);
    addItem("������","���� �а��� ������ ��ħ",true, 4000);
    addItem("������","�������� �а��� ������ ��ħ", true, 5000);
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