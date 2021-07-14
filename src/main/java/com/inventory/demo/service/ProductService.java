package com.inventory.demo.service;

import com.inventory.demo.model.Product;
import com.inventory.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }

    public Product getProductbyId(long productId) {

        return productRepository.findById(productId).get();
    }

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public void deleteById(long productId) {

        productRepository.deleteById(productId);
    }

    public Product updateProduct(long productId, Product product) {

        Product productToUpdate = productRepository.getById(productId);

        productToUpdate.setProductName(product.getProductName());
        productToUpdate.setProductPrice(product.getProductPrice());

        return productRepository.save(productToUpdate);
    }
}
