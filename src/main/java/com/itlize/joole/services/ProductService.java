package com.itlize.joole.services;

import com.itlize.joole.entity.Product;

import java.util.List;

public interface ProductService {
    Product creatProduct(Product product);

    List<Product> findByProductType(String productType);

    List<Product> findAllProduct();

}
