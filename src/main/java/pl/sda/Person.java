package pl.sda;

import java.math.BigDecimal;

public class Person {
    private String name;
    private String surname;
    private BigDecimal debt;

    public Person(String name, String surname, BigDecimal debt) {
        this.name = name;
        this.surname = surname;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BigDecimal getDebt() {
        return debt;
    }
}
