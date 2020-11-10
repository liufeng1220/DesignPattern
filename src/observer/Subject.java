package observer;

import observer.obs.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();  //当主题改变该方法会调用通知所有观察者
}
