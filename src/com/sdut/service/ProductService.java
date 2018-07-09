package com.sdut.service;

import java.util.List;

import com.sdut.model.Products;
import com.sdut.model.Users;

public interface ProductService {
	/**
	 * 添加商品
	 * @param pro
	 * @return
	 */
	public int saveProduct(Products pro);
	/**
	 * 修改商品
	 * @param pro
	 * @return
	 */
	public int updateProduct(Products pro);

	public int delProduct(String id);
	
	public Products findProductById(String id);
	
	public List<Products> findProductList();
	
}
