package pl.sdacademy.java7krk;

public class TemporaryEmployee extends Employee {

    public TemporaryEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public String getEmail() {

        return null;
    }

    @Override
    public double calculateNetSalary() {
        return getGrossSalary() * 0.9;
    }
}
