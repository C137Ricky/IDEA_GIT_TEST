package Singleton;
//懒汉式
public  class Singleton2{
    private  Singleton2(){};
    private  static Singleton2 singleton2;
    public   synchronized static Singleton2 getInstance(){
        if(singleton2==null){
            singleton2=new Singleton2();
        }
        return  singleton2;
    }
}




