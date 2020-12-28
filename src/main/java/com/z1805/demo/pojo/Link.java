package com.z1805.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Link {
    private Integer link_id;

    private Byte link_type;

    private String link_name;

    private String link_url;

    private String link_description;

    private Integer link_rank;

    private Byte is_deleted;

    @JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒")
    private Date create_time;

    public Link(Integer link_id, Byte link_type, String link_name, String link_url, String link_description, Integer link_rank, Byte isDeleted, Date create_time) {
        this.link_id = link_id;
        this.link_type = link_type;
        this.link_name = link_name;
        this.link_url = link_url;
        this.link_description = link_description;
        this.link_rank = link_rank;
        this.is_deleted = isDeleted;
        this.create_time = create_time;
    }

    public Link() {
        super();
    }

    public Integer getLink_id() {
        return link_id;
    }

    public void setLink_id(Integer link_id) {
        this.link_id = link_id;
    }

    public Byte getLink_type() {
        return link_type;
    }

    public void setLink_type(Byte link_type) {
        this.link_type = link_type;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name == null ? null : link_name.trim();
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url == null ? null : link_url.trim();
    }

    public String getLink_description() {
        return link_description;
    }

    public void setLink_description(String link_description) {
        this.link_description = link_description == null ? null : link_description.trim();
    }

    public Integer getLink_rank() {
        return link_rank;
    }

    public void setLink_rank(Integer link_rank) {
        this.link_rank = link_rank;
    }

    public Byte getIs_deleted() {
        return is_deleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.is_deleted = isDeleted;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}