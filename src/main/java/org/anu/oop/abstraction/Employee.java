package org.anu.oop.abstraction;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.MONTHS;

public class Employee implements EmployeeInterface {

    @Override
    public String getEmployeeFirstName() {
        return "Prabhath";
    }

    @Override
    public String getEmployeeLastName() {
        return "Kadurugasyaya";
    }

    @Override
    public LocalDate getEmployeeDoB() {
        return LocalDate.of(1992, 2, 18);
    }

    static long calculateEmployeeAgeByYears(LocalDate employeeDob) {
        return MONTHS.between(employeeDob, LocalDate.now());
    }

    public static void main(String[] args) {

        // Access variables in the interface
        System.out.println(companyId);
        System.out.println(EmployeeInterface.companyId);

        // EmployeeInterface.companyId = 30; This statement gives error since the companyId is final.

        // Default methods in the interface can be invoked in this way.
        Employee employee = new Employee();
        System.out.println(employee.getEmployeeFullName("Prabhath", "Kadurugasyaya"));
        System.out.println(employee.getEmployeeAddress("Block 01", "Street 01", "City", "112333"));

        // Static methods in the interface can be invoked in this way.
        System.out.println(EmployeeInterface.calculateEmployeeAgeByYears(LocalDate.of(1992, 2, 18)));
        System.out.println(EmployeeInterface.calculateEmployeeAgeByDays(LocalDate.of(1992, 2, 18)));

    }
}
