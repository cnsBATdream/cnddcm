package com.cnddcm.promise.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "cn_userlogs")
public class CnUserlogs {
    /**
     * 记录ID
     */
    @Id
    @Column(name = "LOG_LOGID")
    private String logLogid;

    /**
     * 用户ID
     */
    @Column(name = "LOG_USERID")
    private String logUserid;

    /**
     * 用户名
     */
    @Column(name = "LOG_USERNAME")
    private String logUsername;

    /**
     * 记录周 活动的周次
     */
    @Column(name = "LOG_WEEK")
    private String logWeek;

    /**
     * 算法完成度 1为提交；0位未提交
     */
    @Column(name = "LOG_A_COMMIT")
    private Integer logACommit;

    /**
     * 分享完成度 1为提交；0位未提交
     */
    @Column(name = "LOG_R_COMMIT")
    private Integer logRCommit;

    /**
     * 代码完成度 1为提交；0位未提交
     */
    @Column(name = "LOG_T_COMMIT")
    private Integer logTCommit;

    /**
     * 本周完成度 1为提交；0位未提交
     */
    @Column(name = "LOG_S_COMMIT")
    private Integer logSCommit;

    /**
     * 记录时间
     */
    @Column(name = "LOG_INITTIME")
    private Date logInittime;

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
     * 获取记录ID
     *
     * @return LOG_LOGID - 记录ID
     */
    public String getLogLogid() {
        return logLogid;
    }

    /**
     * 设置记录ID
     *
     * @param logLogid 记录ID
     */
    public void setLogLogid(String logLogid) {
        this.logLogid = logLogid;
    }

    /**
     * 获取用户ID
     *
     * @return LOG_USERID - 用户ID
     */
    public String getLogUserid() {
        return logUserid;
    }

    /**
     * 设置用户ID
     *
     * @param logUserid 用户ID
     */
    public void setLogUserid(String logUserid) {
        this.logUserid = logUserid;
    }

    /**
     * 获取用户名
     *
     * @return LOG_USERNAME - 用户名
     */
    public String getLogUsername() {
        return logUsername;
    }

    /**
     * 设置用户名
     *
     * @param logUsername 用户名
     */
    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    /**
     * 获取记录周 活动的周次
     *
     * @return LOG_WEEK - 记录周 活动的周次
     */
    public String getLogWeek() {
        return logWeek;
    }

    /**
     * 设置记录周 活动的周次
     *
     * @param logWeek 记录周 活动的周次
     */
    public void setLogWeek(String logWeek) {
        this.logWeek = logWeek;
    }

    /**
     * 获取算法完成度 1为提交；0位未提交
     *
     * @return LOG_A_COMMIT - 算法完成度 1为提交；0位未提交
     */
    public Integer getLogACommit() {
        return logACommit;
    }

    /**
     * 设置算法完成度 1为提交；0位未提交
     *
     * @param logACommit 算法完成度 1为提交；0位未提交
     */
    public void setLogACommit(Integer logACommit) {
        this.logACommit = logACommit;
    }

    /**
     * 获取分享完成度 1为提交；0位未提交
     *
     * @return LOG_R_COMMIT - 分享完成度 1为提交；0位未提交
     */
    public Integer getLogRCommit() {
        return logRCommit;
    }

    /**
     * 设置分享完成度 1为提交；0位未提交
     *
     * @param logRCommit 分享完成度 1为提交；0位未提交
     */
    public void setLogRCommit(Integer logRCommit) {
        this.logRCommit = logRCommit;
    }

    /**
     * 获取代码完成度 1为提交；0位未提交
     *
     * @return LOG_T_COMMIT - 代码完成度 1为提交；0位未提交
     */
    public Integer getLogTCommit() {
        return logTCommit;
    }

    /**
     * 设置代码完成度 1为提交；0位未提交
     *
     * @param logTCommit 代码完成度 1为提交；0位未提交
     */
    public void setLogTCommit(Integer logTCommit) {
        this.logTCommit = logTCommit;
    }

    /**
     * 获取本周完成度 1为提交；0位未提交
     *
     * @return LOG_S_COMMIT - 本周完成度 1为提交；0位未提交
     */
    public Integer getLogSCommit() {
        return logSCommit;
    }

    /**
     * 设置本周完成度 1为提交；0位未提交
     *
     * @param logSCommit 本周完成度 1为提交；0位未提交
     */
    public void setLogSCommit(Integer logSCommit) {
        this.logSCommit = logSCommit;
    }

    /**
     * 获取记录时间
     *
     * @return LOG_INITTIME - 记录时间
     */
    public Date getLogInittime() {
        return logInittime;
    }

    /**
     * 设置记录时间
     *
     * @param logInittime 记录时间
     */
    public void setLogInittime(Date logInittime) {
        this.logInittime = logInittime;
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