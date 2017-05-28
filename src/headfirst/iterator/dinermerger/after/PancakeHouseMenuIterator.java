package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
  //MenuItem[] items;
  ArrayList<MenuItem> items;
  int position = 0;
  
  public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
    this.items = items;
  }

  public boolean hasNext(){
    if(position >= items.size()){
      return false;
    }else{
      return true;
    }
  }
  public Object next(){
    Object o = items.get(position);
    position++;
    return o;
  }
}