package com.z1805.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog_Tag {
    private Integer tag_id;

    private String tag_name;

    private Byte isDeleted;
    
    @JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
    private Date create_time;

    public Blog_Tag(Integer tag_id, String tag_name, Byte isDeleted, Date create_time) {
        this.tag_id = tag_id;
        this.tag_name = tag_name;
        this.isDeleted = isDeleted;
        this.create_time = create_time;
    }

    public Blog_Tag() {
        super();
    }

    public Integer getTag_id() {
        return tag_id;
    }

    public void setTag_id(Integer tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name == null ? null : tag_name.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}