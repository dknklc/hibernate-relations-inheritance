package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.discriminator;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("root") // Eğer veritabanında discriminatorvalue'sü root ise sen mapleme işlemini RootAccessor olacak şekilde gerçekleştir.
public class RootAccessor extends MachineAccessor {
    private String rootPassword;
    private String rootUsername;
    private String rootIpAddress;
    private String rootMacAddress;
}
