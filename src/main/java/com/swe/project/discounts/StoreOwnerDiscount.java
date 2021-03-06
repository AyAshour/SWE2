package com.swe.project.discounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StoreOwnerDiscount implements Discount{

    private static final String OWNER_ID = "owner";
    private static final double VALUE = 0.1;


@Autowired
private DiscountFactory discountFactory;

@PostConstruct
    public void selfRegister() {
        discountFactory.addDiscount(OWNER_ID, this);
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price*VALUE);
    }
}
