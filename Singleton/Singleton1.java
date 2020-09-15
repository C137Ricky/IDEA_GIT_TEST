package Singleton;
//饿汉式
public class Singleton1 {
   private  Singleton1(){};
   private static final Singleton1 single=new Singleton1();
   //1223455
    //445
   private  static Singleton1 getInstance(){
           return single;
}
}

