package org.anu.oop.abstraction;

import java.time.LocalDate;

public class EmployerSubClass extends Employer{

    @Override
    public String getEmployerName() {
        return "Anuradha Prabhath";
    }

    @Override
    public LocalDate getEmployerDob() {
        return LocalDate.of(1992, 2, 18);
    }

    public int getEmployerId() {
        return 200;
    }

    public EmployerSubClass() {
        // Inside the constructor, we can invoke the methods in this way
        System.out.println(super.getEmployerAgeInYears(LocalDate.of(1992, 2, 18)));
        System.out.println(this.getEmployerDob());
        System.out.println(this.getEmployerId());
        System.out.println(getEmployerName());
    }

    public static void main(String[] args) {

        // By instantiating EmployerSubClass, we can invoke the methods in Employer class.

        Employer employer = new EmployerSubClass();
        System.out.println(employer.getEmployerAgeInYears(LocalDate.of(1992, 2, 18)));
    }
}
