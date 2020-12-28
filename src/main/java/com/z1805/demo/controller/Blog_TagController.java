package com.z1805.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.z1805.demo.pojo.Blog_Tag;
import com.z1805.demo.service.Blog_TagService;
import com.z1805.demo.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog_tag")
@RestController
public class Blog_TagController {

	@Autowired
	private Blog_TagService blog_tagService;
	
	@RequestMapping("/list")
	public PageInfo<Blog_Tag> list(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Blog_Tag blog_tag) {
		
		List<Blog_Tag> list = blog_tagService.list(page,pageSize,blog_tag);

		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/findAll")
	public Result finaAll(){
		
		List<Blog_Tag> list=blog_tagService.findAll();
		
		return new Result(Result.ERROR_CODE,"",list);
		
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blog_tagService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/count")
	public Result count() {
		
		int row = blog_tagService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/insert")
	public int insert(Blog_Tag blog_tag) {
		
		blog_tag.setCreate_time(new Date());
		
		return blog_tagService.insert(blog_tag);
		
	}
	
}
