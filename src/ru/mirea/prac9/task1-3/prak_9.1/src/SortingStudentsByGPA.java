import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.GPA == o2.GPA) return 0;
        else if (o1.GPA > o2.GPA) return -1;
        else return 1;
    }
}
