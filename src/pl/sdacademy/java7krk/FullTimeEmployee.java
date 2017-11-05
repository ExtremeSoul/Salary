package pl.sdacademy.java7krk;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public String getEmail() {

        return null;
    }

    @Override
    public double calculateNetSalary() {
        return (getGrossSalary()-1000) * 0.8;
    }
}
