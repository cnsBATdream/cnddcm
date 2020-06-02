package com.cnddcm.promise.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "cn_algorithm")
public class CnAlgorithm {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "ALG_USERID")
    private String algUserid;

    /**
     * 算法ID(Leecode题号)
     */
    @Column(name = "ALG_ALGID")
    private String algAlgid;

    /**
     * 代码
     */
    @Column(name = "ALG_CODE")
    private String algCode;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

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
     * 获取用户ID
     *
     * @return ALG_USERID - 用户ID
     */
    public String getAlgUserid() {
        return algUserid;
    }

    /**
     * 设置用户ID
     *
     * @param algUserid 用户ID
     */
    public void setAlgUserid(String algUserid) {
        this.algUserid = algUserid;
    }

    /**
     * 获取算法ID(Leecode题号)
     *
     * @return ALG_ALGID - 算法ID(Leecode题号)
     */
    public String getAlgAlgid() {
        return algAlgid;
    }

    /**
     * 设置算法ID(Leecode题号)
     *
     * @param algAlgid 算法ID(Leecode题号)
     */
    public void setAlgAlgid(String algAlgid) {
        this.algAlgid = algAlgid;
    }

    /**
     * 获取代码
     *
     * @return ALG_CODE - 代码
     */
    public String getAlgCode() {
        return algCode;
    }

    /**
     * 设置代码
     *
     * @param algCode 代码
     */
    public void setAlgCode(String algCode) {
        this.algCode = algCode;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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