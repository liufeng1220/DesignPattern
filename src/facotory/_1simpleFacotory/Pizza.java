package facotory._1simpleFacotory;

public abstract class Pizza {
    String name;
    void prepare(){
        System.out.println("装");
    }
    void back(){
        System.out.println("加热");
    }
    void cut(){
        System.out.println("切割");
    }
    void box(){
        System.out.println("打包带走");
    }
}
