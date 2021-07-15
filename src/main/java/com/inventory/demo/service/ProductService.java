package com.inventory.demo.service;

import com.inventory.demo.model.Product;
import com.inventory.demo.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);


    public Product saveProduct(Product product) {

        LOGGER.info("Storing the product");
        return productRepository.save(product);
    }

    public Product getProductbyId(long productId) {

        LOGGER.info("Retrieving the product by id " + productId);
        return productRepository.findById(productId).get();
    }

    public List<Product> getAllProducts() {

        LOGGER.info("Retrieving all the products");
        return productRepository.findAll();
    }

    public void deleteById(long productId) {

        LOGGER.info("Deleting the product with id " + productId);
        productRepository.deleteById(productId);
    }

    public Product updateProduct(long productId, Product product) {

        Product productToUpdate = productRepository.getById(productId);

        LOGGER.info("Updating the product " + product.getProductName());
        productToUpdate.setProductName(product.getProductName());
        productToUpdate.setProductPrice(product.getProductPrice());


        return productRepository.save(productToUpdate);
    }
}
