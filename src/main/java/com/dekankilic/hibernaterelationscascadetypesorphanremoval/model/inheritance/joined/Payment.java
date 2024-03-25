package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.joined;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.math.BigDecimal;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment extends BaseEntity {
    private BigDecimal amount;
    private String currency;
    private String method;
}
