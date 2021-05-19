package com.reskill.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reskill.user.dto.CartDTO;

import com.reskill.user.entity.Cart;

import com.reskill.user.repository.CartRepository;


@Service(value="/cart")
@Transactional
public class CartService {
	
	@Autowired
	private CartRepository cartrepo;
	
	public String addProduct(CartDTO cart) {
		Cart c=new Cart();
		c.setBuyerId(cart.getBuyerId());
		c.setProdId(cart.getBuyerId());
		c.setQuantity(cart.getQuantity());
		cartrepo.save(c);
		return "product";
	}

}
