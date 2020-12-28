package com.z1805.demo.service;

import java.util.List;

import com.z1805.demo.pojo.Link;

public interface LinkService {

	List<Link> list(int page, int pageSize, Link link);
	
	int up(int ids[]);
	
	int count();

	int insert(Link link);
	
	int update(Link link);
	
	Link findById(Integer id);

	List<Link> findAll();
	
}
