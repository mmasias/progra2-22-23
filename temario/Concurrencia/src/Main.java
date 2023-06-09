
import queue.BasicQueue;
import queue.Consumer;
import queue.Producer;

public class Main {
    public static void main(String[] args) {

        int data = 0;
        int result = (data + 1) % 5;
        System.out.println(result);

        BasicQueue queueBuffer;
        Producer producer;
        Consumer consumer[];

        queueBuffer = new BasicQueue(50);

        producer = new Producer(queueBuffer);
        consumer = new Consumer[3];

        for (int index = 0; index < consumer.length; index++) {
            consumer[index] = new Consumer(queueBuffer, index);
        }

        producer.start();

        for (int index = 0; index < consumer.length; index++) {
            consumer[index].start();
        }





public class Main {
    public static void main(String[] args) {

        Concurrente primero, segundo;

        primero = new Concurrente("Hilo1");
        segundo = new Concurrente("Hilo2");

        primero.start();
        segundo.start();


        System.out.println("Main acá termina");
    }
}