package com.z1805.demo.service;

import java.util.List;

import com.z1805.demo.pojo.Blog;

public interface BlogService {

	List<Blog> list(int page, int pageSize, Blog blog);
	
	int up(int ids[]);
	
	int count();

	List<Blog> dim_list(Blog blog);
	
	int add(Blog blog);
	
	List<Blog> findById(Blog blog);
	
	int blog_edit(Blog blog);

	List<Blog> findAllByDate();

	List<Blog> getBlogCountGroup();

	int countByStatus();

	List<Blog> mhcx(int page, int pageSize, Blog blog);

	List<Blog> tags(int page, int pageSize, Blog blog);

	int findAll(String str);
	
}
