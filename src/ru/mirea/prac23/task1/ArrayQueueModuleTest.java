package Java23;

public class ArrayQueueModuleTest {
    public static void fill(ArrayQueueModule queue){
        for (int i = 0; i < 12; ++i){
            queue.enqueue(i);
        }
    }
    public static void dump(ArrayQueueModule queue){
        while (queue.isEmpty() == false){
            System.out.println(queue.dequeue() + " ");
        }
    }
    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule(10);
        fill(queue);
        dump(queue);
    }
}
