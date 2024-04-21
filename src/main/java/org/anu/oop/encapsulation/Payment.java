package org.anu.oop.encapsulation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {

    /**
     * There are four access modifiers in Java. They are public, protected, default and private.
     * Public - Attributes or methods defined with the public can access all over the project.
     * Protected - Attributes or methods defined with the protected can access inside a package. By inheriting protected fields can be accessed in everywhere in the project.
     * Default - Attributes or methods defined with the default can be accessed only inside the package.
     * Private - Attributes or methods defined with the private can be accessed only inside the class.
     */

    private Long paymentId;

    private String paymentType;

    private LocalDate paymentDate;

    private BigDecimal amount;

    public Long getPaymentId() {
        return this.paymentId;
    }

    protected String getPaymentType() {
        return this.paymentType;
    }

    BigDecimal getAmount() {
        return this.amount;
    }
}
