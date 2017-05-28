package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenuIterator implements Iterator{
  MenuItem[] items;
  int position = 0;
  public DinerMenuIterator(MenuItem[] items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position >= items.length || items[position] ==null){
      return false;
    }else{
      return true;
    }
  }
  public Object next(){
    MenuItem m = items[position];
    position++;
    return m;//캐스팅은 언제?
  }
}