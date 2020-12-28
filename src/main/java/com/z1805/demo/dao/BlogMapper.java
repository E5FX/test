package com.z1805.demo.dao;

import java.util.List;

import com.z1805.demo.pojo.Blog;

public interface BlogMapper {

	List<Blog> list(Blog blog);
	
	int up(int ids[]);
	
	int count();
	
	List<Blog> dim_list(Blog blog);
	
	int add(Blog blog);
	
	List<Blog> findById(Blog blog);
	
	int blog_edit(Blog blog);

	List<Blog> findAllByDate();

	List<Blog> getBlogCountGroup();

	int countByStatus();

	List<Blog> mhcx(Blog blog);

	List<Blog> tags(Blog blog);

	int findAll(String str);

}
