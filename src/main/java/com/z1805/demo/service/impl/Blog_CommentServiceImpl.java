package com.z1805.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z1805.demo.dao.Blog_commentMapper;
import com.z1805.demo.pojo.Blog;
import com.z1805.demo.pojo.Blog_Comment;
import com.z1805.demo.service.Blog_CommentService;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class Blog_CommentServiceImpl implements Blog_CommentService{

	@Autowired
	private Blog_commentMapper blog_commentMapper;
	
	@Override
	public List<Blog_Comment> list(int page, int pageSize, Blog_Comment blog_comment) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("comment_id desc");
		return blog_commentMapper.list(blog_comment);
	}
	
	@Override
	public int up(int[] ids) {
		return blog_commentMapper.up(ids);
	}
	
	@Override
	public int count() {
		return blog_commentMapper.count();
	}
	
	@Override
	public int audit(int[] ids) {
		return blog_commentMapper.audit(ids);
	}

	@Override
	public int edit_comment(Blog_Comment blog_comment) {
		return blog_commentMapper.edit_comment(blog_comment);
	}

	@Override
	public List<Blog_Comment> list_comment(Blog_Comment blog_comment) {
		return blog_commentMapper.list_comment(blog_comment);
	}

	@Override
	public int countByBlogId(int blog_id) {
		return blog_commentMapper.countByBlogId(blog_id);
	}

	@Override
	public List<Blog> findByBlogId(int page, int pageSize, Integer asd) {
		PageHelper.startPage(page, pageSize);
		return blog_commentMapper.findByBlogId(asd);
	}

	@Override
	public int add(Blog_Comment blog_comment) {
		return blog_commentMapper.add(blog_comment);
	}
	
}
