package Singleton;

//这是静态内部类构建方式
public class Singleton3 {
    private  Singleton3(){};
    private static class Singleton3ClassInstance{
       private static  final Singleton3 instance=new Singleton3();
    }
    private static Singleton3 getInstance(){
        return  Singleton3ClassInstance.instance;
    }
}
