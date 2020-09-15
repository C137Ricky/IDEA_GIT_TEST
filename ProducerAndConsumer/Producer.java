package ProducerAndConsumer;

public class Producer extends Thread{
    Box box;
    public  Producer(Box box){
        this.box=box;
    }

    public  void run(){
        while(true){
            try{
                box.put(10);
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
