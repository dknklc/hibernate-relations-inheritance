package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.joined;

import jakarta.persistence.Entity;

@Entity
public class BitcoinProvider extends Payment{
    private String bitcoinAddress;
    private String bitcoinWallet;
    private String bitcoinProviderName;
}
