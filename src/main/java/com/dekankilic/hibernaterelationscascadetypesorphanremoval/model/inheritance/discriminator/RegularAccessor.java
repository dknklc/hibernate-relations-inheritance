package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.discriminator;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.BaseEntity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("regular") // Eğer veritabanında discriminatorvalue'sü regular ise sen mapleme işlemini RegularAccessor olacak şekilde gerçekleştir.
public class RegularAccessor extends MachineAccessor {
    private String ipAddress;
    private String macAddress;
    private List<String> logHistory;
}
