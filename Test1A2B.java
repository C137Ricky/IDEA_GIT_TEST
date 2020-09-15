import javafx.scene.control.TableRow;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test1A2B {
//    public static void main(String[] args) {
//    String s1=new String("hello");
//    String internl=s1.intern();
//    String s2="hello";
//    System.out.println(s2==s1);
//    String s3=new String("hello")+new String("hello");
////    String intern3=s3.intern();
//    String s4="hellohello";
//    System.out.println(s3==s4);


    static class t1 extends Thread{
        public void run(){
            System.out.print("t1");
        };
    }
    static  class  t2 extends  Thread{
        public void run() {
            System.out.print("t2");
        }
    }
    static  class  t3 extends  Thread{
        public  void run(){
            System.out.print("t3");
        };
    }
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++) {
        Thread t1=new t1();
        Thread t2=new t2();
        Thread t3=new t3();
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();

        }


    }
    }

