package com.z1805.demo.service;

import java.util.List;

import com.z1805.demo.pojo.Blog_Tag;

public interface Blog_TagService {

	List<Blog_Tag> list(int page, int pageSize, Blog_Tag blog_tag);
	
	List<Blog_Tag> findAll();
	
	int up(int ids[]);
	
	int count();
	
	int insert(Blog_Tag blog_tag);
	
}
