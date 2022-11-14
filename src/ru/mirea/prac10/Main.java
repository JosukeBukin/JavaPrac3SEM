package ru.mirea.prac10;

import java.util.Scanner;

class SortingStudentByGPA implements Comparator<Student> {
    Scanner in = new Scanner(System.in);
    public Student[] idNumber;
    int size;

    public void setArray() {
        double gpa_inp;
        System.out.print("Введите размер списка: ");
        size = in.nextInt();
        idNumber = new Student[size];
        in.nextLine();
        for (int i = 0; i < size; i++) {
            idNumber[i] = new Student();
            System.out.print("Введите имя студента: ");
            idNumber[i].setName(in.nextLine());
            System.out.print("Введите фамилию студента: ");
            idNumber[i].setSurname(in.nextLine());
            System.out.print("Введите курс студента: ");
            idNumber[i].setCourse(in.nextInt());
            System.out.print("Введите группу студента: ");
            in.nextLine();
            idNumber[i].setGroup(in.nextLine());
            System.out.print("Введите специальность студента: ");
            idNumber[i].setSpecialty(in.nextLine());
            System.out.print("Введите средний балл студента: ");
            gpa_inp = in.nextDouble();
            idNumber[i].setGpa(gpa_inp);
            in.nextLine();
            System.out.println();
        }
    }

    public void outArray() {
        for (int i = size -1; i >= 0; i--) {
            System.out.println(idNumber[i].getName() + " " +
                    idNumber[i].getSurname() + " " + idNumber[i].getCourse() +
                    " " + idNumber[i].getGroup() + " " + idNumber[i].getSpecialty() +
                    " " + idNumber[i].getGpa());
        }
    }

    @Override
    public void quicksort(int low, int high) {
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        double base = idNumber[middle].getGpa();
        int i = low, j = high;
        while (i <= j) {
            while (idNumber[i].getGpa() < base) {
                i++;
            }
            while (idNumber[j].getGpa() > base) {
                j--;
            }
            if (i <= j) {
                Student temp = idNumber[i];
                idNumber[i] = idNumber[j];
                idNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quicksort(low, j);
        if (high > 1) quicksort(i, high);
    }

    @Override
    public void insertSortByGPA()
    {
        int prev, now;
        Student temp;
        for (int i = 1; i < size; i++)
        {
            prev = i - 1;
            now = i;
            while (prev >= 0 && idNumber[prev].getGpa() > idNumber[now].getGpa())
            {
                temp = idNumber[now];
                idNumber[i] = idNumber[prev];
                idNumber[prev] = temp;
                prev--;
                now--;
            }
        }
    }

    @Override
    public void insertSortByCourse()
    {
        int prev, now;
        Student temp;
        for (int i = 1; i < size; i++)
        {
            prev = i - 1;
            now = i;
            while (prev >= 0 && idNumber[prev].getCourse() > idNumber[now].getCourse())
            {
                temp = idNumber[now];
                idNumber[i] = idNumber[prev];
                idNumber[prev] = temp;
                prev--;
                now--;
            }
        }
    }

    public void extendArray(Student[] otherArray)
    {
        int newSize = size + otherArray.length;
        Student[] newArray = new Student[newSize];
        for (int i = 0; i < newSize; i++)
        {
            if (i < size) newArray[i] = idNumber[i];
            else newArray[i] = otherArray[i-size];
        }
        size = newSize;
        idNumber = newArray;
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим первый список");
        SortingStudentByGPA tester1 = new SortingStudentByGPA();
        tester1.setArray();
        System.out.println("Создадим второй список");
        SortingStudentByGPA tester2 = new SortingStudentByGPA();
        tester2.setArray();
        System.out.println("Отсортируем первый список быстрой сортировкой по среднему баллу");
        tester1.quicksort(0, tester1.size - 1);
        tester1.outArray();
        System.out.println("Отсортируем второй список вставками по курсу");
        tester2.insertSortByCourse();
        tester2.outArray();
        System.out.println("Объединим списки");
        tester1.extendArray(tester2.idNumber);
        tester1.outArray();
        System.out.println("Отсортируем полученый список вставками по среднему баллу");
        tester1.insertSortByGPA();
        tester1.outArray();
    }
}
