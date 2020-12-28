package com.z1805.demo.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.z1805.demo.pojo.Admin_User;
import com.z1805.demo.pojo.BlogConfig;
import com.z1805.demo.service.Admin_User_Service;
import com.z1805.demo.util.Result;

@RestController
@RequestMapping("/user")
public class Admin_User_Controller {
	
	@Autowired
	private Admin_User_Service admin_User_Service;
	
	@RequestMapping("/login")
	public Result login(Admin_User admin_user,HttpServletRequest request,HttpSession session) {
		Result result=new Result();
		Admin_User t_user=admin_User_Service.login(admin_user);
		if(t_user==null) {
			result.setCode(Result.ERROR_CODE);
			result.setMessage("用户名或密码错误！");
		}else {
			session.setAttribute("user", t_user);
		}
		return result;
	}
	
	@RequestMapping("/name_and_img")
	public Result name_and_img() {
		
		List<BlogConfig> name_and_img=admin_User_Service.name_and_img();
		
		return new Result(Result.SUCCESS_CODE, "", name_and_img);
		
	}
	
	@RequestMapping("/findUserById")
	public Result findUserById(int admin_user_id) {
		
		Admin_User admin_user=admin_User_Service.findUserById(admin_user_id);
		
		return new Result(Result.SUCCESS_CODE, "", admin_user);
	}
	
	@RequestMapping("/edit")
	public Result edit(Admin_User admin_user) {
		
		int row=admin_User_Service.edit(admin_user);
		
		return new Result(Result.SUCCESS_CODE, "",row);
	
	}
	
	@RequestMapping("/list_admin_user")
	public Result list_admin_user(Admin_User admin_user) {
		
		List<Admin_User> list = admin_User_Service.list_admin_user(admin_user);
		
		return new Result(Result.SUCCESS_CODE, "",list);
		
	}
	
	@RequestMapping("/edit_admin_user")
	public Result edit_admin_user(Admin_User admin_user) {
		
		int row=admin_User_Service.edit_admin_user(admin_user);
		
		return new Result(Result.SUCCESS_CODE, "",row);
	
	}
	
	@RequestMapping("/exit")
	public void tc(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException {
		Enumeration em = request.getSession().getAttributeNames();  //得到session中所有的属性名
		while (em.hasMoreElements()) {
			request.getSession().removeAttribute(em.nextElement().toString()); //遍历删除session中的值
		}
	}
	
}
