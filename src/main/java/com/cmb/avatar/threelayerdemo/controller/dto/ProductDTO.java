package com.cmb.avatar.threelayerdemo.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDTO {
    private String id;
    private String name;
    private float price;
}
