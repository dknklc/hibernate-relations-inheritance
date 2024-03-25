package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String addressLine;
    private String zipCode;
}
