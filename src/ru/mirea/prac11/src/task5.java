// время выполнения кода через Linked list = 385200
// время выполения кода через array list = 36900


import java.util.LinkedList;

public class task5 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        LinkedList<Integer> al = new LinkedList<>();
        al.add(3);
        al.add(4);
        al.add(6);
        al.add(8);
        al.remove(1);
        al.set(0, 12);
        al.set(1, 13);
        al.contains(12);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


//        long startTime = System.nanoTime();
//        ArrayList <Integer> al = new ArrayList<>();
//        al.add(3);
//        al.add(4);
//        al.add(6);
//        al.add(8);
//        al.remove(1);
//        al.set(0,12);
//        al.set(1,13);
//        al.contains(12);
//        long endTime = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
    }
}