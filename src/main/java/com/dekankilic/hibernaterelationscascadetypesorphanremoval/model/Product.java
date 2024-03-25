package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer quantity;

    // Benim product'ı oluştururken productDetail'i de oluşturmam gerekiyor mu? Evet. Onun için cascade kullanıyoruz.
    // OrphanRemoval : means ben product'ı sildiğimde productDetail de silinsin istiyorsam kullanıyoruz.
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_detail_id", referencedColumnName = "ID")
    private ProductDetail productDetail;

    // Category için benim cascade type yapmama gerek yok çünkü bu UI'da dropdown şeklinde hali hazırda veritabanında barınıyor.
    // Ben sadece bana geleni product.setCategory(category) deyip set edeceğim.
    // Aynı zamanda ben product'ı sildiğim zaman category'i silmemeliyim. Niye siliyim ki categoryler halen olmalı.
    // Bu yüzden burada cascade type'a ihtiyacım yok.
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "ID")
    private Category category;


    // JoinTable annotation kullanacağım ManyToMany relation için.

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PRODUCT_TAG_REL",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "ID")
    )
    private Set<Tag> tags;
}

/*
* CascadeTypes : Product'ı eklemek istediğimizde onun ilişkide olduğun productDetail, category(bunun için gerek yok) ve tagların da eklenmesini istediğimiz de ki aksi takdirde önce productDetail'i kaydedip,
* sonra onun id'sini product içerisinde productDetail'e set etmemiz ve bunu diğer ilişkide olduğu alanlar içinde yapmamız gerekecekti ki bu çok uğraştırıcı birşey. Bunun için biz CascadeTypesları kullanıyoruz.
*
*
*
* */