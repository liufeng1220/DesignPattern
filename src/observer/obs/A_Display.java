package observer.obs;

import observer.Subject;

public class A_Display implements  Observer {

    private float temperature;
    private float humidity;
    //事实上该主题是想自动调用时候自己删除自己，方便删除，当然也可以通过主题调用删除
    private Subject weatherData;
    public A_Display(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.printf("A版=======当前天气%s,当前湿度%s,当前气压%s%n",temp,humidity,pressure);
    }
}
