package ru.mirea.prac_17.Task_17_2_Employee;

public class Employee {
    private String name;
    private int workedHours;
    private int rate;
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public int getRate() {
        return rate;
    }
    public int getWorkedHours() {
        return workedHours;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}

class EmployeeController {
    private final Employee model;
    private final EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name) {model.setName(name);}
    public String getEmployeeName() {return model.getName();}
    public int getEmployeeRate() {return model.getRate();}
    public int getEmployeeWorkedHours() {return model.getWorkedHours();}
    public void setEmployeeRate(int rate) {model.setRate(rate);}
    public void setEmployeeWorkedHours(int workedHours) {model.setWorkedHours(workedHours);}
    public void updateView() {
        view.printEmployeeSalary(model.getName(), model.getWorkedHours(), model.getRate());
    }
}
class EmployeeView {
    public void printEmployeeSalary(String name, int hours, int rate) {
        System.out.println(name + "'s salary for this month: " + (hours * rate) + "p");
    }
}
