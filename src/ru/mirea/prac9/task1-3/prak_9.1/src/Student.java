public class Student implements Comparable<Student>{
    String full_name;
    int GPA;

    public Student() {
        full_name = "Gargaridze V.I.";
    }

    public Student(String full_name) {
        this.full_name = full_name;
    }

    public Student(String full_name, int GPA) {
        this.full_name = full_name;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.GPA, other.GPA);
    }

    public String getFull_name() {
        return full_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "full_name='" + full_name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public static Student[] insertion_sort(Student[] Arr) {

        for (int i = 1; i < Arr.length; i++) {
            int j = i;
            Student temp_obj = Arr[i];
            String temp = Arr[i].getFull_name();

            while (j > 0 && (Arr[j - 1].getFull_name().charAt(0) + "").compareTo(temp.charAt(0) + "") > 0) {
                Arr[j] = Arr[j - 1];
                j--;
            }
            Arr[j] = temp_obj;
        }

        return Arr;
    }

    public static Student[] merge_sorting(Student[] Arr) {

        if (Arr.length < 2) {
            return Arr;
        }

        Student[] new_ar1 = new Student[Arr.length / 2];
        Student[] new_ar2 = new Student[Arr.length - new_ar1.length];

        System.arraycopy(Arr, 0, new_ar1, 0, new_ar1.length);
        System.arraycopy(Arr, new_ar1.length, new_ar2, 0, new_ar2.length);

        new_ar1 = merge_sorting(new_ar1);
        new_ar2 = merge_sorting(new_ar2);

        return merging(new_ar1, new_ar2);
    }

    public static Student[] merging(Student[] arr1, Student[] arr2) {

        Student[] res_arr = new Student[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if ((arr1[i].getFull_name().charAt(0) + "").compareTo(arr2[j].getFull_name().charAt(0) + "") <= 0) {
                res_arr[k] = arr1[i];
                i++;
            } else {
                res_arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            res_arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            res_arr[k] = arr2[j];
            j++;
            k++;
        }

        return res_arr;
    }


}
