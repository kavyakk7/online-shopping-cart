package com.kk.shoppingcartbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kk.shoppingcartbackend.dao.CategoryDAO;
import com.kk.shoppingcartbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Women Clothing");
		category.setDescription("Wide Variety of Women Clothing");
		category.setImageURL("#");

		categories.add(category);

		Category category1 = new Category();

		category1.setId(2);
		category1.setName("Men Clothing");
		category1.setDescription("Wide Variety of Men Clothing");
		category1.setImageURL("#");

		categories.add(category1);

		Category category2 = new Category();

		category2.setId(3);
		category2.setName("Kids Clothing");
		category2.setDescription("Wide Variety of Kids Clothin");
		category2.setImageURL("#");

		categories.add(category2);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories){
			 if(category.getId() == id)	return category;
		}
		return null;
	}

}
