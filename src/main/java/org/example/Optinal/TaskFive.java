package org.example.Optinal;

import java.util.Optional;

public class TaskFive {
    static void main() {


        Employee emp1 = new Employee(new Contract(true,
                2500.0));

        Employee emp2 = new Employee(new Contract(false,
                3000.0));

        Employee emp3 = new Employee(new Contract(true,
                800.0));

        Employee emp4 = new Employee(null);

        Employee emp5 = null;

        System.out.println(calculateBonus(emp1));

        System.out.println(calculateBonus(emp2));
        System.out.println(calculateBonus(emp3));
        System.out.println(calculateBonus(emp4));
        System.out.println(calculateBonus(emp5));
        System.out.println("Easy");
        System.out.println(calculateBonusEasy(emp1));
        System.out.println(calculateBonusEasy(emp2));
        System.out.println(calculateBonusEasy(emp3));
        System.out.println(calculateBonusEasy(emp4));
        System.out.println(calculateBonusEasy(emp5));
    }

    public static Double calculateBonus(Employee emp) {
        if (emp != null) {
            Contract contract = emp.getContract();
            if (contract != null && contract.isActive()) {
                Double salary = contract.getSalary();
                if (salary != null && salary > 1000) {
                    return salary * 0.1;
                }
            }
        }
        return 0.0;
    }

    public static Double calculateBonusEasy(Employee employee) {
        return Optional.ofNullable(employee).map(Employee::getContract).filter(Contract::isActive)
               .map(Contract::getSalary).filter(salary -> salary > 1000).map(salary -> salary * 0.1).orElse(0.0);

    }
}

class Contract {
    private final boolean active;
    private final Double salary;

    public Contract(boolean active, Double salary) {
        this.active = active;
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public Double getSalary() {
        return salary;
    }
}

class Employee {
    private final Contract contract;

    public Employee(Contract contract) {
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }
}