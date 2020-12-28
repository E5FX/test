package com.z1805.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.z1805.demo.dao.Admin_User_Mapper;
import com.z1805.demo.pojo.Admin_User;
import com.z1805.demo.pojo.BlogConfig;
import com.z1805.demo.service.Admin_User_Service;

@Service
@Transactional
public class Admin_User_Service_Impl implements Admin_User_Service {

	@Autowired
	private Admin_User_Mapper admin_User_Mapper;
	
	@Override
	public Admin_User login(Admin_User admin_user) {
		return admin_User_Mapper.login(admin_user);
	}

	@Override
	public List<BlogConfig> name_and_img() {
		return admin_User_Mapper.name_and_img();
	}
	
	@Override
	public Admin_User findUserById(int admin_user_id) {
		return admin_User_Mapper.findUserById(admin_user_id);
	}

	@Override
	public int edit(Admin_User admin_user) {
		return admin_User_Mapper.edit(admin_user);
	}

	@Override
	public List<Admin_User> list_admin_user(Admin_User admin_user) {
		return admin_User_Mapper.list_admin_user(admin_user);
	}

	@Override
	public int edit_admin_user(Admin_User admin_user) {
		return admin_User_Mapper.edit_admin_user(admin_user);
	}

}
