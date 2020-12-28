package com.z1805.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z1805.demo.dao.Blog_tagMapper;
import com.z1805.demo.pojo.Blog_Tag;
import com.z1805.demo.service.Blog_TagService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class Blog_TagServiceImpl implements Blog_TagService{

	@Autowired
	private Blog_tagMapper blog_tagMapper;
	
	@Override
	public List<Blog_Tag> list(int page, int pageSize, Blog_Tag blog_tag) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("tag_id desc");
		return blog_tagMapper.list(blog_tag);
	}

	@Override
	public List<Blog_Tag> findAll() {
		return blog_tagMapper.findAll();
	}
	
	@Override
	public int up(int[] ids) {
		return blog_tagMapper.up(ids);
	}
	
	@Override
	public int count() {
		return blog_tagMapper.count();
	}
	
	@Override
	public int insert(Blog_Tag blog_tag) {
		return blog_tagMapper.insert(blog_tag);
	}

}
