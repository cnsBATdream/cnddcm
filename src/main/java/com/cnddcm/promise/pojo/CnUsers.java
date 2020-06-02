package com.cnddcm.promise.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "cn_users")
public class CnUsers {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 用户昵称
     */
    @Column(name = "USER_NICKNAME")
    private String userNickname;

    /**
     * 用户头像
     */
    @Column(name = "USER_PICURL")
    private String userPicurl;

    /**
     * 用户邮箱
     */
    @Column(name = "USER_EMAIL")
    private String userEmail;

    /**
     * 创建时间
     */
    @Column(name = "USER_CREATED_TIME")
    private Date userCreatedTime;

    /**
     * 更新人
     */
    @Column(name = "USER_UPDATED_BY")
    private String userUpdatedBy;

    /**
     * 更新时间
     */
    @Column(name = "USER_UPDATED_TIME")
    private Date userUpdatedTime;

    /**
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户昵称
     *
     * @return USER_NICKNAME - 用户昵称
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 设置用户昵称
     *
     * @param userNickname 用户昵称
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 获取用户头像
     *
     * @return USER_PICURL - 用户头像
     */
    public String getUserPicurl() {
        return userPicurl;
    }

    /**
     * 设置用户头像
     *
     * @param userPicurl 用户头像
     */
    public void setUserPicurl(String userPicurl) {
        this.userPicurl = userPicurl;
    }

    /**
     * 获取用户邮箱
     *
     * @return USER_EMAIL - 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取创建时间
     *
     * @return USER_CREATED_TIME - 创建时间
     */
    public Date getUserCreatedTime() {
        return userCreatedTime;
    }

    /**
     * 设置创建时间
     *
     * @param userCreatedTime 创建时间
     */
    public void setUserCreatedTime(Date userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    /**
     * 获取更新人
     *
     * @return USER_UPDATED_BY - 更新人
     */
    public String getUserUpdatedBy() {
        return userUpdatedBy;
    }

    /**
     * 设置更新人
     *
     * @param userUpdatedBy 更新人
     */
    public void setUserUpdatedBy(String userUpdatedBy) {
        this.userUpdatedBy = userUpdatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return USER_UPDATED_TIME - 更新时间
     */
    public Date getUserUpdatedTime() {
        return userUpdatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param userUpdatedTime 更新时间
     */
    public void setUserUpdatedTime(Date userUpdatedTime) {
        this.userUpdatedTime = userUpdatedTime;
    }
}