package com.barkmew.store.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double price;
    private int Stock;
    private boolean active;
    private Category category;
}
