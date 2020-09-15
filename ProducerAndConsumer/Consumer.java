package ProducerAndConsumer;

import java.util.Random;

public class Consumer extends  Thread{
    Box box;
    public  Consumer(Box box){
        this.box=box;
    }

    public void run(){
        while(true){
            try {
                box.get();
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
