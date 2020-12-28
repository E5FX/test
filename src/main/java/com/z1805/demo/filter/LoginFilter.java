package com.z1805.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.z1805.demo.pojo.Admin_User;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest requestServletRequest, ServletResponse responseServletResponse, FilterChain chain)
			throws IOException, ServletException {
			
			HttpServletRequest request=(HttpServletRequest) requestServletRequest;
		
			HttpServletResponse response=(HttpServletResponse) responseServletResponse;
			
			HttpSession session=request.getSession();
			
			Admin_User admin_User=(Admin_User) session.getAttribute("user");
			
			System.out.println(admin_User);
			
			if (admin_User==null) {
				response.sendRedirect(request.getContextPath()+"login.html");
			}else {
				response.sendRedirect(request.getContextPath()+"/backstage/home_page.html");
			}
	}
	
}
