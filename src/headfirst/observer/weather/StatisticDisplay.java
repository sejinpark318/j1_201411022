package headfirst.observer.weather;

public class StatisticDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public StatisticDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  public void update(float t, float h, float p){
    this.temperature = t;
    this.humidity = h;
    display();
  }
  public void display(){
    System.out.println("Statistic conditions: about " + temperature 
                      + " +2 F degrees and " + humidity +"% humidity");
  }
}