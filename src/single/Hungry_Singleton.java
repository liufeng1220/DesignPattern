package single;

/**
 * 饿汉单例模式
 * 可以保证只创建一个对象，并且没有线程安全问题
 * 缺点是JVM加载到该类一开始就创建，不论有没有用到
 */
public class Hungry_Singleton {
    private static Hungry_Singleton uniqueInstance = new Hungry_Singleton();

    private Hungry_Singleton() {
    }

    public static Hungry_Singleton getInstance() {
        return uniqueInstance;
    }
}
