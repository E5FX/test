package com.z1805.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.z1805.demo.pojo.Blog;
import com.z1805.demo.service.BlogService;
import com.z1805.demo.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog")
@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@RequestMapping("/list")
	public PageInfo<Blog> list(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "4", name = "limit") int pageSize, Blog blog) {
		List<Blog> list = blogService.list(page,pageSize,blog);

		PageInfo<Blog> info = new PageInfo<>(list);

		return info;
	}
	
	@RequestMapping("/findAll")
	public int findAll(String str) {
		return blogService.findAll(str);
	}
	
	@RequestMapping("/mhcx")
	public PageInfo<Blog> mhcx(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize,Blog blog) {
		
		List<Blog> list = blogService.mhcx(page,pageSize,blog);
		
		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/tags")
	public PageInfo<Blog> tags(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize,Blog blog) {
		
		List<Blog> list = blogService.tags(page,pageSize,blog);
		
		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("countByStatus")
	public int countByStatus() {
		return blogService.countByStatus();
		
	}
	
	@RequestMapping("/getBlogCountGroup")
	public Result getBlogCountGroup() {
		
		Result result=new Result();
		
		List<Blog> blogs=blogService.getBlogCountGroup();
		
		result.setCode(Result.SUCCESS_CODE);
		result.setMessage("");
		result.setData(blogs);
		
		return result;	
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blogService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/dim_list")
	public Result dim_list(Blog blog) {
		
		List<Blog> list = blogService.dim_list(blog);
		
		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/findAllByDate")
	public Result findAllByDate() {
		
		List<Blog> list=blogService.findAllByDate();
		
		Result result=new Result(Result.SUCCESS_CODE, "",list);
		
		return result;
	}
	
	@RequestMapping("/add")
	public Result add(Blog blog) {
		
		blog.setCreate_time(new Date());
		
		blog.setUpdate_time(new Date());
		
		blog.setBlog_views(0);
		
		blog.setIs_deleted(0);
		
		int row = blogService.add(blog);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/findById")
	public Result findById(Blog blog) {
		
		List<Blog> list = blogService.findById(blog);
		
		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/blog_edit")
	public Result blog_edit(Blog blog) {
		
		blog.setUpdate_time(new Date());
		
		int row = blogService.blog_edit(blog);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/count")
	public Result count() {
		int row = blogService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
}
