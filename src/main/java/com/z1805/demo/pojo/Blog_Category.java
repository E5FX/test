package com.z1805.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog_Category {
    private Integer category_id;

    private String category_name;

    private String category_icon;

    private Integer categoryRank;

    private Byte isDeleted;

    @JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
    private Date create_time;

    public Blog_Category(Integer category_id, String category_name, String category_icon, Integer categoryRank, Byte isDeleted, Date create_time) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_icon = category_icon;
        this.categoryRank = categoryRank;
        this.isDeleted = isDeleted;
        this.create_time = create_time;
    }

    public Blog_Category() {
        super();
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name == null ? null : category_name.trim();
    }

    public String getCategory_icon() {
        return category_icon;
    }

    public void setCategory_icon(String category_icon) {
        this.category_icon = category_icon == null ? null : category_icon.trim();
    }

    public Integer getCategoryRank() {
        return categoryRank;
    }

    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
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