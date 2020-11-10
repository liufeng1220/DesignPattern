package observer;

import observer.obs.A_Display;
import observer.obs.B_Display;

/**
 * 当setMeasurements方法调用时候就会自动将最新数据发送给观察者
 */
public class Test_Observer {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        A_Display a_display = new A_Display(w);
        B_Display b_display = new B_Display(w);
        w.setMeasurements(12,12,12);
        w.removeObserver(a_display);
        w.setMeasurements(7,3,1);
        w.registerObserver(a_display);
        w.setMeasurements(65,33,12);

    }
}
