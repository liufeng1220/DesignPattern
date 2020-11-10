package observer.obs;

import observer.Subject;

public class B_Display implements Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public B_Display(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.printf("B版=====当前天气%s,当前湿度%s,当前气压%s%n",temp,humidity,pressure);
    }
}
