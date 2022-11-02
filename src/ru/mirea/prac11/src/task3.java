public class task3 {
    private final int[] array;

    public task3() {
        array = new int[]{7, 3, 2, 6, 5};
    }

    public void InsertionSort() {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                int a = 0;
                a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
                if (i != 0) {
                    if ((array[i - 1] > array[i])) {
                        int b = 0;
                        b = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = b;
                    }
                }
            }
        }
    }

    public void PrintScr() {
        for (int aarray : array) {
            System.out.print(aarray + " ");
        }
    }


    public static void main(String[] args) {
        task3 student = new task3();
        student.InsertionSort();
        student.PrintScr();
    }
}
