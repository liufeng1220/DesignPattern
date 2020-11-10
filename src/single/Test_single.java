package single;

public class Test_single extends Thread {
    public static void main(String[] args) {
        SingletTest s1 = new SingletTest();
        SingletTest s2 = new SingletTest();
        SingletTest s3 = new SingletTest();
        s1.start();
        s2.start();
        s3.start();
    }
}

class SingletTest extends Thread {
    @Override
    public void run() {
        System.out.println(Lazy_Singleton.getInstance());
    }
}
