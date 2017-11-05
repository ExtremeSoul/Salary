package pl.sdacademy.java7krk;

public abstract class Employee implements Person {


    protected Employee(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public abstract String getEmail();

    private double grossSalary;

    public double getGrossSalary() {
        return grossSalary;
    }

    public abstract double calculateNetSalary();

}
