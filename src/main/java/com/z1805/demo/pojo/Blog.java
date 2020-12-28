package com.z1805.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog {

	private int blog_id;//博客表主键id
	
	private String blog_title;//博客标题
	
	private String blog_sub_url;//博客自定义路径url
	
	private String blog_cover_image;//博客封面图
	
	private String blog_content;//博客内容
	
	private int blog_category_id;//博客分类id
	
	private String blog_category_name;//博客分类(冗余字段)
	
	private String blog_tags;//博客标签
	
	private int blog_status;//0-草稿 1-发布
	
	private int blog_views;//阅读量
	
	private int enable_comment;//0-允许评论 1-不允许评论
	
	private int is_deleted;//是否删除 0=否 1=是
	
	@JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
	private Date create_time;//添加时间
	
	private Date update_time;//修改时间
	
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public Blog(int blog_id, String blog_title, String blog_sub_url, String blog_cover_image, String blog_content,
			int blog_category_id, String blog_category_name, String blog_tags, int blog_status, int blog_views,
			int enable_comment, int is_deleted, Date create_time, Date update_time) {
		super();
		this.blog_id = blog_id;
		this.blog_title = blog_title;
		this.blog_sub_url = blog_sub_url;
		this.blog_cover_image = blog_cover_image;
		this.blog_content = blog_content;
		this.blog_category_id = blog_category_id;
		this.blog_category_name = blog_category_name;
		this.blog_tags = blog_tags;
		this.blog_status = blog_status;
		this.blog_views = blog_views;
		this.enable_comment = enable_comment;
		this.is_deleted = is_deleted;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public int getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}

	public String getBlog_title() {
		return blog_title;
	}

	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}

	public String getBlog_sub_url() {
		return blog_sub_url;
	}

	public void setBlog_sub_url(String blog_sub_url) {
		this.blog_sub_url = blog_sub_url;
	}

	public String getBlog_cover_image() {
		return blog_cover_image;
	}

	public void setBlog_cover_image(String blog_cover_image) {
		this.blog_cover_image = blog_cover_image;
	}

	public String getBlog_content() {
		return blog_content;
	}

	public void setBlog_content(String blog_content) {
		this.blog_content = blog_content;
	}

	public int getBlog_category_id() {
		return blog_category_id;
	}

	public void setBlog_category_id(int blog_category_id) {
		this.blog_category_id = blog_category_id;
	}

	public String getBlog_category_name() {
		return blog_category_name;
	}

	public void setBlog_category_name(String blog_category_name) {
		this.blog_category_name = blog_category_name;
	}

	public String getBlog_tags() {
		return blog_tags;
	}

	public void setBlog_tags(String blog_tags) {
		this.blog_tags = blog_tags;
	}

	public int getBlog_status() {
		return blog_status;
	}

	public void setBlog_status(int blog_status) {
		this.blog_status = blog_status;
	}

	public int getBlog_views() {
		return blog_views;
	}

	public void setBlog_views(int blog_views) {
		this.blog_views = blog_views;
	}

	public int getEnable_comment() {
		return enable_comment;
	}

	public void setEnable_comment(int enable_comment) {
		this.enable_comment = enable_comment;
	}

	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Blog [blog_id=" + blog_id + ", blog_title=" + blog_title + ", blog_sub_url=" + blog_sub_url
				+ ", blog_cover_image=" + blog_cover_image + ", blog_content=" + blog_content + ", blog_category_id="
				+ blog_category_id + ", blog_category_name=" + blog_category_name + ", blog_tags=" + blog_tags
				+ ", blog_status=" + blog_status + ", blog_views=" + blog_views + ", enable_comment=" + enable_comment
				+ ", is_deleted=" + is_deleted + ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}
	
	
}
