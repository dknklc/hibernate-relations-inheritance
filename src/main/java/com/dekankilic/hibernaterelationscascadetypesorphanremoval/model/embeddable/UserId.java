package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.embeddable;


import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

// Benim primary keyim iki tane fielddan oluşuyorsa. Yani composite primary key ise. Hibernate tarafında Embeddable kullanıyoruz.
// Bu iki fieldı birleştirerek primary key'i sağlıyoruz.
@Data
@Embeddable
public class UserId implements Serializable {
    private String email;
    private String userName;
}
