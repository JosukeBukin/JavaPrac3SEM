package Java23;

class ArrayQueue {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.rear = -1;
        this.front = 0;
        this.nElem = 0;
    }
    public void enqueue(int elem) {
        if (this.nElem == this.maxSize){
            System.out.println("Queue is full");
            return;
        }
        if (this.rear == this.maxSize - 1) {  // циклический перенос
            this.rear = -1;
        }

        this.queue[++this.rear] = elem;  //увеличение Rear и вставка
        this.nElem++;  // увеличение количества элементов в очереди
    }
    public int dequeue() {
        int temp = this.queue[this.front++]; // получаем первый элемент из очереди

        if (this.front == this.maxSize) { // циклический перенос
            this.front = 0;
        }
        this.nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }
    public int element() {
        return this.queue[this.front];
    }

    public int getRear() {
        return this.queue[this.rear];
    }
    public void clear(){
        this.rear = -1;
        this.front = 0;
        this.nElem = 0;
    }
    public boolean isEmpty() {
        return (this.nElem == 0);
    }

    public int size() {
        return this.nElem;
    }
}
