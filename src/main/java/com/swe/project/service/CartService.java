package com.swe.project.service;

import com.swe.project.entity.Cart;
import com.swe.project.entity.User;
import com.swe.project.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    public void addCart(Cart cart){
        cartRepo.save(cart);
    }

    public Cart getCartById(Integer cartId){
        return cartRepo.getCartByCartId(cartId);
    }

    public Cart getCartByUser(User user){
        return cartRepo.getCartByUser(user);
    }

}
