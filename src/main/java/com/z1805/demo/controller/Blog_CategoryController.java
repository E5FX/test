package com.z1805.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.z1805.demo.pojo.Blog_Category;
import com.z1805.demo.service.Blog_CategoryService;
import com.z1805.demo.util.GetFoldFileNames;
import com.z1805.demo.util.Result;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog_category")
@RestController
public class Blog_CategoryController {

	@Autowired
	private Blog_CategoryService blog_categoryService;
	
	@RequestMapping("/list")
	public PageInfo<Blog_Category> list3(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Blog_Category blog_category) {
		
		List<Blog_Category> list = blog_categoryService.list(page,pageSize,blog_category);

		return new PageInfo<>(list);
		
	}
	
	@RequestMapping("/update_dels")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		
		int row = blog_categoryService.up(ids);

		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
	@RequestMapping("/count")
	public Result count() {
		
		int row = blog_categoryService.count();
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/findAll")
	public Result finaAll(){
		
		List<Blog_Category> list=blog_categoryService.findAll();
		
		return new Result(Result.ERROR_CODE,"",list);
		
	}
	
	@RequestMapping("/findById")
	public Blog_Category findById(@RequestParam(name="id")Integer id){
		
		return blog_categoryService.findById(id);
		
	}
	
	@RequestMapping("/insert")
	public int insert(Blog_Category blog_Category) {
		
		blog_Category.setCreate_time(new Date());
		
		return blog_categoryService.insert(blog_Category);
		
	}
	
	@RequestMapping("/update")
	public int update(Blog_Category blog_Category){
		
		return blog_categoryService.update(blog_Category);
		
	}
	
	@RequestMapping("/getImage")
	public Result getImage() {
		
		Result result=new Result();
		
		List<String> list=GetFoldFileNames.getFileName();
		
		result.setCode(Result.ERROR_CODE);
		
		result.setMessage("");
		
		result.setData(list);
		
		return result;
		
	}
}
