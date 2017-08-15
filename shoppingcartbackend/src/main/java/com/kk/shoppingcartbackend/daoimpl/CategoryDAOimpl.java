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
		category.setName("TV");
		category.setDescription("Television");
		category.setImageURL("CAT.png");

		categories.add(category);

		Category category1 = new Category();

		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("Mobile phones");
		category1.setImageURL("CAT.png");

		categories.add(category1);

		Category category2 = new Category();

		category2.setId(3);
		category2.setName("Clothes");
		category2.setDescription("Men and Women Clothing");
		category2.setImageURL("CAT.png");

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
