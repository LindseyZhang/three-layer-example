package com.cmb.avatar.threelayerdemo.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductQueryRequest {
    private String name;
    private Float maxPrice;
    private Float minPrice;
}
