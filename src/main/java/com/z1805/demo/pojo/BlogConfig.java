package com.z1805.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BlogConfig {
	
	private String config_name;
	
	private String config_value;
	
	@JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
	private Date create_time;
	
	@JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
	private Date update_time;
	
	public BlogConfig() {}

	public BlogConfig(String config_name, String config_value, Date create_time, Date update_time) {
		super();
		this.config_name = config_name;
		this.config_value = config_value;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public String getConfig_name() {
		return config_name;
	}

	public void setConfig_name(String config_name) {
		this.config_name = config_name;
	}

	public String getConfig_value() {
		return config_value;
	}

	public void setConfig_value(String config_value) {
		this.config_value = config_value;
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
		return "Config [config_name=" + config_name + ", config_value=" + config_value + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
}