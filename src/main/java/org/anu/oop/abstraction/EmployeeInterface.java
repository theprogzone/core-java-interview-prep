package org.anu.oop.abstraction;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public interface EmployeeInterface {

    // All the attributes in interfaces are public, final and static. This is because interfaces cannot be instantiated.
    int companyId = 56;

    String getEmployeeFirstName();

    String getEmployeeLastName();

    LocalDate getEmployeeDoB();

    /**
     * From Java 8 onwards, interfaces can have method bodies for default methods and static methods.
     * Default methods not essential to override in the implemented classes.
     */

    default String getEmployeeFullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }

    default String getEmployeeAddress(String addressLine1, String addressLine2, String addressLine3, String postCode) {
        return addressLine1.concat(", ").concat(addressLine2).concat(", ").concat(addressLine3).concat(", ").concat(postCode);
    }

    static long calculateEmployeeAgeByYears(LocalDate employeeDob) {
        return YEARS.between(employeeDob, LocalDate.now());
    }

    static long calculateEmployeeAgeByDays(LocalDate employeeDob) {
        return DAYS.between(employeeDob, LocalDate.now());
    }

}
