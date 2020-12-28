package com.z1805.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.z1805.demo.pojo.BlogConfig;
import com.z1805.demo.service.Blog_ConfigService;
import com.z1805.demo.util.Result;

@RestController
@RequestMapping("/config")
public class Blog_ConfigController {

	@Autowired
	private Blog_ConfigService configService;
	
	@RequestMapping("/list")
	public Result list() {

		List<BlogConfig> list=configService.list();
		
		return new Result(Result.SUCCESS_CODE, "", list);
	}
	
	@RequestMapping("/findByConfigName")
	public Result findByConfigName(String config_name) {
		
		BlogConfig blogconfig=configService.findByConfigName(config_name);
		
		return new Result(Result.SUCCESS_CODE, "", blogconfig);
	}
	
	@RequestMapping("findByConfigNames")
	public Result findByConfigNames(@RequestParam(name = "config_names[]")String[] config_names) {

		List<BlogConfig> list=configService.findByConfigNames(config_names);
		
		return new Result(Result.SUCCESS_CODE,"",list);
	}
	
	@RequestMapping("/edit")
	public Result edit(BlogConfig blogconfig) {
		
		blogconfig.setUpdate_time(new Date());
		
		int row=configService.edit(blogconfig);
		
		return new Result(Result.SUCCESS_CODE, "", row);
		
	}
	
}
