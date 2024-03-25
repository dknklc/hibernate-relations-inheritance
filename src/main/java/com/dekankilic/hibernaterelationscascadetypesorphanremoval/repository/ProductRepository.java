package com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
