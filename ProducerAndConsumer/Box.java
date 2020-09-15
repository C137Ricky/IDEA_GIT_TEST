package ProducerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Box {
    Queue<Integer> queue=new LinkedList<Integer>();
    int maxSize=50;

    public  void put(int producrt){
        synchronized (this){
        while(queue.size()>=maxSize){
            try{
                System.out.println("队列满了，生产者等待");
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        queue.add(producrt);
            System.out.println("放入一个商品，现在有" + queue.size() + "个商品");
            notifyAll();
    }
    }
    public  void get(){
        synchronized (this){
            while(queue.size()<=0){
                try{
                    System.out.println("队列空了，消费者等待");
                    wait();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            queue.remove();
            System.out.println("取出一个商品，现在有" + queue.size() + "个商品");
            notifyAll();
        }
    }
}
