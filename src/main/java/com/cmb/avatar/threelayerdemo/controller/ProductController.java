package com.cmb.avatar.threelayerdemo.controller;

import com.cmb.avatar.threelayerdemo.controller.assembler.ProductAssembler;
import com.cmb.avatar.threelayerdemo.controller.command.AddProductCommand;
import com.cmb.avatar.threelayerdemo.controller.dto.ProductDTO;
import com.cmb.avatar.threelayerdemo.repository.model.Product;
import com.cmb.avatar.threelayerdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> queryProduct(@RequestParam String name) {
        final List<Product> products = productService.query(name);
        return ProductAssembler.toProductDtoList(products);
    }

    @PostMapping
    public void addProduct(@RequestBody AddProductCommand addProductCommand) {
        productService.addProduct(addProductCommand);
    }
}
