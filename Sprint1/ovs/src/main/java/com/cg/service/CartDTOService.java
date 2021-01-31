package com.cg.service;

import java.util.List;

import com.cg.domain.CartDTO;
import com.cg.domain.VegetableDTO;

public interface CartDTOService {
	public VegetableDTO addToCart(VegetableDTO item);
	public VegetableDTO updateItemQuantity(VegetableDTO id,int quantity);
	public List<VegetableDTO> viewAllItems(CartDTO cart);
	public CartDTO removeAllItems(CartDTO cart);
}
