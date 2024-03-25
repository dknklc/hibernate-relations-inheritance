package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private String brand;
    private Boolean warranty;

    // ProductDetail silindiğinde product da silinsin mi? Olabilir, mantıklı ve bu yüzden cascade kullandık.
    @OneToOne(mappedBy = "productDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private Product product;
}
