package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    @OneToMany(mappedBy = "category", orphanRemoval = true, cascade = CascadeType.REMOVE) // orphanRemoval : Benim atıyorum Telefon diye categoryim var ve ben bunu sildiğimde onun altındaki productlarda silinsin diyorum
    private List<Product> products;
}


