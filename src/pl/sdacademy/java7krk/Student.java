package pl.sdacademy.java7krk;

public class Student extends Employee {

    public Student(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public String getEmail() {

        return null;
    }

    @Override
    public double calculateNetSalary() {
        return getGrossSalary() * 0.95;
    }
}
