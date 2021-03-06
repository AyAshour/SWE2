package com.swe.project.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductActions extends Action{
    private static final String AFFECTED_OBJECT = "product";

    @ManyToOne
    @JoinColumn(name = "productId")
    Product product;

    public ProductActions() {
        product = null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductActions(Product product) {
        this.product = product;
        this.affectedObject = AFFECTED_OBJECT;
    }
}
