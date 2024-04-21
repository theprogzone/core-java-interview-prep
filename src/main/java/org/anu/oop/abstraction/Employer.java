package org.anu.oop.abstraction;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public abstract class Employer {

    /**
     * Abstract classes can have both method definition and methods with method body.
     * Java abstract classes cannot be instantiated.
     * To invoke the methods inside abstract classes, abstract class always should be inherited by a sub class.
     *
     */

    public abstract String getEmployerName();

    public abstract LocalDate getEmployerDob();

    public long getEmployerAgeInYears(LocalDate dob) {
        return YEARS.between(dob, LocalDate.now());
    }
}
