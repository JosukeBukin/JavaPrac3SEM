package ru.mirea.prac23.task1;

public class ArrayQueueATDTest {
    public static void fill(ArrayQueueATD queue){
        for (int i = 0; i < 17; ++i)
            ArrayQueueATD.enqueue(queue, i);
    }
    public static void dump(ArrayQueueATD queue){
        while (ArrayQueueATD.isEmpty(queue) == false){

            System.out.println(ArrayQueueATD.dequeue(queue) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayQueueATD queue = new ArrayQueueATD();
        fill(queue);
        dump(queue);
    }
}
