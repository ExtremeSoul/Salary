package pl.sdacademy.java7krk;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Employee student = new Student(1450.27);
        Employee temporary = new TemporaryEmployee(2000.43);
        Employee full = new FullTimeEmployee(3000.40);
//        Employee full1 = new FullTimeEmployee(3046.32);

        company.addEmployee(student);
        company.addEmployee(temporary);
        company.addEmployee(full);
//        company.addEmployee(full1);

        System.out.println(String.format("%.2f", company.sumOfSalaries()));
        System.out.println(String.format("%.2f", company.averageOfSalaries()));

    }
}
