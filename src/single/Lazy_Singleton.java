package single;

/**
 * 1、该操作在单线程下没有问题，但是多线程的情况下，有可能两个线程同时执行到判断uniqueInstance是否为空，结果都判断为空，同时进入实例化
 * 此时就会产生两个实例对象。
 *
 * 2、可以给getInstance方法加上 synchronized 关键字，也就是同步锁，这样就可以保证不会有两个线程同时进入该方法
 *
 * 3、使用双重检查锁，关键字 volatile修饰类变量，该关键字的作用是首先会检查实例是否已经创建了，如果尚未创建，才会进行同步。
 */
public class Lazy_Singleton {
    private volatile static Lazy_Singleton uniqueInstance;

    private Lazy_Singleton() {
    }

    public static synchronized Lazy_Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Lazy_Singleton();
        }
        return uniqueInstance;
    }
}
