package ecom.com.service;

import java.util.List;


import ecom.com.model.Cart;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void updateQuantity(String sy, Integer cid);

	//public void updateQuantity(String sy, Integer cid);

}
