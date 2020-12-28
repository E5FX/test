package com.z1805.demo.service;

import java.util.List;

import com.z1805.demo.pojo.Blog_Category;

public interface Blog_CategoryService {
	
	List<Blog_Category> list(int page, int pageSize, Blog_Category blog_category);
	
	int up(int ids[]);
	
	int count();
	
	int insert(Blog_Category blog_category);
	
	Blog_Category findById(Integer id);
	
	int update(Blog_Category blog_category);
	
	List<Blog_Category> findAll();

}
