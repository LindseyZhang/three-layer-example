package com.cmb.avatar.threelayerdemo.controller;

import com.cmb.avatar.threelayerdemo.controller.assembler.ProductAssembler;
import com.cmb.avatar.threelayerdemo.controller.command.AddProductCommand;
import com.cmb.avatar.threelayerdemo.controller.dto.ProductDTO;
import com.cmb.avatar.threelayerdemo.repository.model.Product;
import com.cmb.avatar.threelayerdemo.service.ProductService;
import io.swagger.annotations.ApiOperation;
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

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ApiOperation(value = "根据产品名称查询产品列表", response = Product.class, responseContainer = "list")
    public List<ProductDTO> queryProduct(@RequestParam String name) {
        final List<Product> products = productService.query(name);
        return ProductAssembler.toProductDtoList(products);
    }

    @PostMapping
    @ApiOperation(value = "添加产品")
    public void addProduct(@RequestBody AddProductCommand addProductCommand) {
        productService.addProduct(addProductCommand);
    }
}
