package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.singletable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PublicMachine extends Machine{
    private String publicVpn;
    private String publicIp;
    private String publicMacAddress;
}
