package com.z1805.demo.dao;

import java.util.List;

import com.z1805.demo.pojo.Link;

public interface LinkMapper {

	List<Link> list(Link link);
	
	int up(int ids[]);
	
	int count();
	
	int insert(Link link);
	
	int update(Link link);
	
	Link findById(int id);

	List<Link> findAll();
	
}
