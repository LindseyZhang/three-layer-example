package com.cmb.avatar.threelayerdemo.controller.assembler;

import com.cmb.avatar.threelayerdemo.controller.dto.ProductDTO;
import com.cmb.avatar.threelayerdemo.repository.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductAssembler {
    public static List<ProductDTO> toProductDtoList(List<Product> products) {
        return products.stream().map(ProductAssembler::toProductDto).collect(Collectors.toList());
    }

    public static ProductDTO toProductDto(Product product) {
        return ProductDTO.builder()
            .id(product.getId())
            .price(product.getPrice())
            .name(product.getName())
            .build();
    }

}
