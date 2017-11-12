package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_reference")
public class YbUserReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分销用户ID
     */
    private Integer suid;

    /**
     * 跟进用户ID
     */
    private Integer ruid;

    /**
     * 分销层级
     */
    private Integer level;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 分销关系状态，当为1时比较正常计算分销收益，当为0时表示分销关系过期
     */
    private Integer status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分销用户ID
     *
     * @return suid - 分销用户ID
     */
    public Integer getSuid() {
        return suid;
    }

    /**
     * 设置分销用户ID
     *
     * @param suid 分销用户ID
     */
    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    /**
     * 获取跟进用户ID
     *
     * @return ruid - 跟进用户ID
     */
    public Integer getRuid() {
        return ruid;
    }

    /**
     * 设置跟进用户ID
     *
     * @param ruid 跟进用户ID
     */
    public void setRuid(Integer ruid) {
        this.ruid = ruid;
    }

    /**
     * 获取分销层级
     *
     * @return level - 分销层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置分销层级
     *
     * @param level 分销层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取分销关系状态，当为1时比较正常计算分销收益，当为0时表示分销关系过期
     *
     * @return status - 分销关系状态，当为1时比较正常计算分销收益，当为0时表示分销关系过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置分销关系状态，当为1时比较正常计算分销收益，当为0时表示分销关系过期
     *
     * @param status 分销关系状态，当为1时比较正常计算分销收益，当为0时表示分销关系过期
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}