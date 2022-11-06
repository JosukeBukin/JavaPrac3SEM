package Java23;

public class ArrayQueueTest {
    public static void fill(ArrayQueue queue){
        for (int i = 0; i < 17; ++i){
            queue.enqueue(i);
        }
    }
    public static  void dump(ArrayQueue queue){
        while (queue.isEmpty() == false){
            System.out.println(queue.size() + " " + queue.dequeue());
        }
    }
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        fill(queue);
        dump(queue);
    }
}
