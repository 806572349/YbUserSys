package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yd_user_card")
public class YdUserCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 卡ID
     */
    private Integer cid;

    /**
     * 绑定时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 加油次数
     */
    @Column(name = "use_times")
    private Integer useTimes;

    /**
     * 是否解绑0、解绑1、正常
     */
    private Integer unbind;

    /**
     * 是否默认0、非默认，1、默认
     */
    private Integer isdefault;

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
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取卡ID
     *
     * @return cid - 卡ID
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置卡ID
     *
     * @param cid 卡ID
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取绑定时间
     *
     * @return create_time - 绑定时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置绑定时间
     *
     * @param createTime 绑定时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取加油次数
     *
     * @return use_times - 加油次数
     */
    public Integer getUseTimes() {
        return useTimes;
    }

    /**
     * 设置加油次数
     *
     * @param useTimes 加油次数
     */
    public void setUseTimes(Integer useTimes) {
        this.useTimes = useTimes;
    }

    /**
     * 获取是否解绑0、解绑1、正常
     *
     * @return unbind - 是否解绑0、解绑1、正常
     */
    public Integer getUnbind() {
        return unbind;
    }

    /**
     * 设置是否解绑0、解绑1、正常
     *
     * @param unbind 是否解绑0、解绑1、正常
     */
    public void setUnbind(Integer unbind) {
        this.unbind = unbind;
    }

    /**
     * 获取是否默认0、非默认，1、默认
     *
     * @return isdefault - 是否默认0、非默认，1、默认
     */
    public Integer getIsdefault() {
        return isdefault;
    }

    /**
     * 设置是否默认0、非默认，1、默认
     *
     * @param isdefault 是否默认0、非默认，1、默认
     */
    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
}