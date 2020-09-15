package Singleton;


//双锁检测模式
public class Singleton4 {
    private  static  volatile Singleton4 singleton4;
    private  Singleton4(){};
    private  static   Singleton4 getInstance(){
        if(singleton4==null){//避免不必要的同步
            synchronized (Singleton4.class){//如果为空则创建单例对象
                singleton4=new Singleton4();
            }
        }
        return  singleton4;
    }
}
//voltile为了保证单例对象的可见性，禁止指令重排。
//编译过后是一条lock指令，将缓存中的值强制复制到主存中来实现可见性。