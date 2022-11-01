import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        //1 ПУНКТ{
        Student[] iDNumber = new Student[10];

        //Заполнение массива iDNumber
        for (int i = 0; i < iDNumber.length; i++) {

            if (i % 3 == 0) iDNumber[i] = new Student("Bananov S.V.");

            else if (i % 2 == 0) iDNumber[i] = new Student("Zananov S.V.");

            else iDNumber[i] = new Student("Kabanov S.V.");

        }

        iDNumber = Student.insertion_sort(iDNumber);

        out_arr(iDNumber, "ПУНКТ 1");
        //}

        //2 ПУНКТ{
        //Заполнение массива Student[]
        Student[] Arr = new Student[] {new Student("V", 10),
                new Student("S", 30),
                new Student("F", 20)};
        Arrays.sort(Arr, new SortingStudentsByGPA());

        out_arr(Arr, "ПУНКТ 2");
        //}

        //3 ПУНКТ{
        Student[] studentsList;
        //Возьмем массивы из 1 и 2 пунктов.
        studentsList = Student.merging(iDNumber, Arr);
        studentsList = Student.merge_sorting(studentsList);

        out_arr(studentsList, "ПУНКТ 3");
        //}



    }

    public static void out_arr(Object[] arr, String name_p) {

        System.out.printf(" - Start of output for %s - \n", name_p);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" - %s - \n", arr[i]);
        }

        System.out.printf(" - End of output %s - \n", name_p);
    }

}
