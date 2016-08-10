package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;

@Repository
public interface CategoryDAO {
	//declare all CRUD operations
	
	public boolean save(Category categorey);
	public boolean update(Category categorey);
	public boolean delete(Category categorey);
	public Category get(String id);
	public List<Category> list();


}
