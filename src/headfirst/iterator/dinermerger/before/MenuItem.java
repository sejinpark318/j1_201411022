package headfirst.iterator.dinermerger.before;

//메뉴아이템 개별 아이템
//메뉴판이 메뉴,. 메뉴하나하나를 메뉴아이템
//데이터베이스 표를 떠올리기
public class MenuItem{
  String name;
  String description;
  boolean vegetarian;
  double price;
  public MenuItem(String n, String d, boolean v, double p){
    this.name = n;
    this.description = d;
    this.vegetarian = v;
    this.price = p;
  }
  
  public String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public boolean isVegetarian(){
    return vegetarian;
  }
  public double getPrice(){
    return price;
  }
}