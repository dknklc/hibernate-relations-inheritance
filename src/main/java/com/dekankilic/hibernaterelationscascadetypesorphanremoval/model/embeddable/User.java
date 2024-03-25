package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.embeddable;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @EmbeddedId
    private UserId id;

    @Embedded
    private Address address;
}
