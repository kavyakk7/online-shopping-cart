package com.kk.shoppingcartbackend.dao;

import java.util.List;

import com.kk.shoppingcartbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
