package ProducerAndConsumer;

public class Test {
    public static void main(String[] args) {
        Box box=new Box();
        new Producer(box).start();
        new Consumer(box).start();
    }
}
