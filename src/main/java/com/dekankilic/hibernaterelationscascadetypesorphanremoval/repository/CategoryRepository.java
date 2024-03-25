package com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
