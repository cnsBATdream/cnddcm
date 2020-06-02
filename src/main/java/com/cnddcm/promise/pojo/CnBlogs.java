package com.cnddcm.promise.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "cn_blogs")
public class CnBlogs {
    /**
     * 博客ID
     */
    @Id
    @Column(name = "BLOGS_ID")
    private String blogsId;

    /**
     * 用户ID
     */
    @Column(name = "BLOGS_OWNERID")
    private String blogsOwnerid;

    /**
     * 博客地址
     */
    @Column(name = "BLOGS_ADDRESS")
    private String blogsAddress;

    /**
     * 博客简介
     */
    @Column(name = "BLOGS_TYPE")
    private String blogsType;

    /**
     * 发布状态 1为展示，2为不展示
     */
    @Column(name = "BLOGS_STATUS")
    private Integer blogsStatus;

    /**
     * 审核状态（预留字段） 1为审核通过，2位不通过
     */
    @Column(name = "BLOGS_AUDIT")
    private Integer blogsAudit;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime;

    /**
     * 获取博客ID
     *
     * @return BLOGS_ID - 博客ID
     */
    public String getBlogsId() {
        return blogsId;
    }

    /**
     * 设置博客ID
     *
     * @param blogsId 博客ID
     */
    public void setBlogsId(String blogsId) {
        this.blogsId = blogsId;
    }

    /**
     * 获取用户ID
     *
     * @return BLOGS_OWNERID - 用户ID
     */
    public String getBlogsOwnerid() {
        return blogsOwnerid;
    }

    /**
     * 设置用户ID
     *
     * @param blogsOwnerid 用户ID
     */
    public void setBlogsOwnerid(String blogsOwnerid) {
        this.blogsOwnerid = blogsOwnerid;
    }

    /**
     * 获取博客地址
     *
     * @return BLOGS_ADDRESS - 博客地址
     */
    public String getBlogsAddress() {
        return blogsAddress;
    }

    /**
     * 设置博客地址
     *
     * @param blogsAddress 博客地址
     */
    public void setBlogsAddress(String blogsAddress) {
        this.blogsAddress = blogsAddress;
    }

    /**
     * 获取博客简介
     *
     * @return BLOGS_TYPE - 博客简介
     */
    public String getBlogsType() {
        return blogsType;
    }

    /**
     * 设置博客简介
     *
     * @param blogsType 博客简介
     */
    public void setBlogsType(String blogsType) {
        this.blogsType = blogsType;
    }

    /**
     * 获取发布状态 1为展示，2为不展示
     *
     * @return BLOGS_STATUS - 发布状态 1为展示，2为不展示
     */
    public Integer getBlogsStatus() {
        return blogsStatus;
    }

    /**
     * 设置发布状态 1为展示，2为不展示
     *
     * @param blogsStatus 发布状态 1为展示，2为不展示
     */
    public void setBlogsStatus(Integer blogsStatus) {
        this.blogsStatus = blogsStatus;
    }

    /**
     * 获取审核状态（预留字段） 1为审核通过，2位不通过
     *
     * @return BLOGS_AUDIT - 审核状态（预留字段） 1为审核通过，2位不通过
     */
    public Integer getBlogsAudit() {
        return blogsAudit;
    }

    /**
     * 设置审核状态（预留字段） 1为审核通过，2位不通过
     *
     * @param blogsAudit 审核状态（预留字段） 1为审核通过，2位不通过
     */
    public void setBlogsAudit(Integer blogsAudit) {
        this.blogsAudit = blogsAudit;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_TIME - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return UPDATED_BY - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATED_TIME - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}