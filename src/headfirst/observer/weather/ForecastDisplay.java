package headfirst.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public ForecastDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  public void update(float t, float h, float p){
    this.temperature = t;
    this.humidity = h;
    display();
  }
  public void display(){
    System.out.println("Forecast conditions: " + temperature 
                      + "+10 F degrees and " + humidity +"% humidity\n");
  }
}