package com.itlize.joole.services.imp;


import com.itlize.joole.entity.Product;
import com.itlize.joole.repository.ProductRepository;
import com.itlize.joole.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product creatProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findByProductType(String productType) {
       List<Product> products = productRepository.findAll().stream().filter(product -> product.getProductType().toLowerCase().startsWith(productType))
               .collect(Collectors.toList());
       return products;
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}
