package Java23;

class ArrayQueueModule {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public ArrayQueueModule(int _maxSize) {
        maxSize = _maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void enqueue(int elem) {
        if (nElem == maxSize){
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }

        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }
    public int dequeue() {
        int temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }
    public int element() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }
    public void clear(){
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int size() {
        return nElem;
    }
}
