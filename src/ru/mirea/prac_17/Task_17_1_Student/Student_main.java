package ru.mirea.prac_17.Task_17_1_Student;

public class Student_main {

    public static void main(String[] args) {
        Student model = retrieveStudentFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentRollNo("Bebey");
        System.out.println("After updating:");
        controller.updateView();
    }

    private static Student retrieveStudentFromDB(){
        Student student = new Student();
        student.setName("Scala ne pridymal"); //можно изменить
        student.setRollNo("bruh"); //можно изменить
        return student;
    }
}





