package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.joined;

import jakarta.persistence.Entity;

@Entity
public class PaypayProvider extends Payment {
    private String paypalEmail;
    private String paypalPassword;
    private String paypalProviderName;
}
