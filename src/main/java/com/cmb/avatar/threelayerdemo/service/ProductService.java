package com.cmb.avatar.threelayerdemo.service;

import com.cmb.avatar.threelayerdemo.controller.command.AddProductCommand;
import com.cmb.avatar.threelayerdemo.repository.ProductRepository;
import com.cmb.avatar.threelayerdemo.repository.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> query(String name) {
        return productRepository.findByName(name);
    }

    public int addProduct(AddProductCommand addProductCommand) {
        return productRepository.addProduct(addProductCommand);
    }
}
