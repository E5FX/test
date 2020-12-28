package com.z1805.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z1805.demo.dao.BlogConfigMapper;
import com.z1805.demo.pojo.BlogConfig;
import com.z1805.demo.service.Blog_ConfigService;

@Service
public class Blog_ConfigServiceImpl implements Blog_ConfigService {

	@Autowired
	private BlogConfigMapper blogConfigMapper;
	
	@Override
	public List<BlogConfig> list() {
		return blogConfigMapper.list();
	}

	@Override
	public BlogConfig findByConfigName(String config_name) {
		return blogConfigMapper.findByConfigName(config_name);
	}

	@Override
	public int edit(BlogConfig blogconfig) {
		return blogConfigMapper.edit(blogconfig);
	}

	@Override
	public List<BlogConfig> findByConfigNames(String[] config_names) {
		return blogConfigMapper.findByConfigNames(config_names);
	}

}
