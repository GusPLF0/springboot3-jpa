package com.gusdev.demo.repositories;

import com.gusdev.demo.models.Category;
import com.gusdev.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
