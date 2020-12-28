package com.z1805.demo.dao;

import java.util.List;

import com.z1805.demo.pojo.Blog_Tag;

public interface Blog_tagMapper {

	List<Blog_Tag> list(Blog_Tag blog_tag);
	
	List<Blog_Tag> findAll();
	
	int up(int ids[]);
	
	int count();
	
	int insert(Blog_Tag blog_tag);
	
}
