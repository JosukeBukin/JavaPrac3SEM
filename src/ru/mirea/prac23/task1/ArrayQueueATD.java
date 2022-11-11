package Java23;

class ArrayQueueATD {
    private int maxSize = 15; // максимальное количество элементов в очереди
    private int[] queue = new int[maxSize];
    private int nElem = 0;  // текущее количество элементов в очереди
    private int front = 0;
    private int rear = -1;


    public static void enqueue(ArrayQueueATD queue, int elem) {
        if (queue.nElem == queue.maxSize){
            System.out.println("Queue is full");
            return;
        }
        if (queue.rear == queue.maxSize - 1) {  // циклический перенос
            queue.rear = -1;
        }

        queue.queue[++queue.rear] = elem;  //увеличение Rear и вставка
        queue.nElem++;  // увеличение количества элементов в очереди
    }
    public static int dequeue(ArrayQueueATD queue) {
        int temp = queue.queue[queue.front++]; // получаем первый элемент из очереди

        if (queue.front == queue.maxSize) { // циклический перенос
            queue.front = 0;
        }
        queue.nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }
    public static int element(ArrayQueueATD queue) {
        return queue.queue[queue.front];
    }

    public static int getRear(ArrayQueueATD queue) {
        return queue.queue[queue.rear];
    }
    public static void clear(ArrayQueueATD queue){
        queue.rear = -1;
        queue.front = 0;
        queue.nElem = 0;
    }
    public static boolean isEmpty(ArrayQueueATD queue) {
        return (queue.nElem == 0);
    }

    public static int size(ArrayQueueATD queue) {
        return queue.nElem;
    }
}
