package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.discriminator;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.BaseEntity;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "machine_accessor", discriminatorType = DiscriminatorType.STRING) // Buraya bir column adı vereceğim ve diyeceğim ki sen bu column adına göre kendini ayrıştır. Eğer root isen root user ol, regular isen regular ol.
public class MachineAccessor extends BaseEntity {
    private String name;
    private String ipAddress;
    private String macAddress;
}
