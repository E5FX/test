package com.z1805.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z1805.demo.dao.Blog_categoryMapper;
import com.z1805.demo.pojo.Blog_Category;
import com.z1805.demo.service.Blog_CategoryService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class Blog_CategoryServiceImpl implements Blog_CategoryService{

	@Autowired
	private Blog_categoryMapper blog_categoryMapper;
	
	@Override
	public List<Blog_Category> list(int page, int pageSize, Blog_Category blog_category) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("category_id desc");
		return blog_categoryMapper.list(blog_category);
	}
	
	@Override
	public int up(int[] ids) {
		return blog_categoryMapper.up(ids);
	}
	
	@Override
	public int count() {
		return blog_categoryMapper.count();
	}
	
	@Override
	public int insert(Blog_Category blog_category) {
		return blog_categoryMapper.insert(blog_category);
	}
	
	@Override
	public int update(Blog_Category blog_category) {
		return blog_categoryMapper.update(blog_category);
	}
	
	@Override
	public Blog_Category findById(Integer id) {
		return blog_categoryMapper.findById(id);
	}

	@Override
	public List<Blog_Category> findAll() {
		return blog_categoryMapper.findAll();
	}

}
