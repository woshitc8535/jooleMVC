package com.itlize.joole.repository;

import com.itlize.joole.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {
    @Override
    Optional<Product> findById(String series);

    @Override
    List<Product> findAll();
}
