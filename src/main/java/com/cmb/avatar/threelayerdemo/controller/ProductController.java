package com.cmb.avatar.threelayerdemo.controller;

import com.cmb.avatar.threelayerdemo.controller.request.ProductQueryRequest;
import com.cmb.avatar.threelayerdemo.controller.response.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping
    public ResponseEntity<ProductResponse> queryProduct(ProductQueryRequest productQueryRequest) {
        return ResponseEntity.ok(new ProductResponse());
    }
}
