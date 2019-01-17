package com.cmb.avatar.threelayerdemo.controller.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductCommand {
    private String name;
    private Float price;
}
