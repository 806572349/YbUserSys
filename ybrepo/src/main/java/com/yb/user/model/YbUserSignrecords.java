package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_signrecords")
public class YbUserSignrecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    /**
     * 最长连续签到数
     */
    private Integer orders;

    /**
     * 当前连续签到天数
     */
    private Integer orderday;

    /**
     * 总签到天数
     */
    private Integer sum;

    /**
     * 签到时间
     */
    private Date time;

    /**
     * 送积分
     */
    private Integer reward;

    /**
     * 备注
     */
    private String remark;

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
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取最长连续签到数
     *
     * @return orders - 最长连续签到数
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置最长连续签到数
     *
     * @param orders 最长连续签到数
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取当前连续签到天数
     *
     * @return orderday - 当前连续签到天数
     */
    public Integer getOrderday() {
        return orderday;
    }

    /**
     * 设置当前连续签到天数
     *
     * @param orderday 当前连续签到天数
     */
    public void setOrderday(Integer orderday) {
        this.orderday = orderday;
    }

    /**
     * 获取总签到天数
     *
     * @return sum - 总签到天数
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * 设置总签到天数
     *
     * @param sum 总签到天数
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * 获取签到时间
     *
     * @return time - 签到时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置签到时间
     *
     * @param time 签到时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取送积分
     *
     * @return reward - 送积分
     */
    public Integer getReward() {
        return reward;
    }

    /**
     * 设置送积分
     *
     * @param reward 送积分
     */
    public void setReward(Integer reward) {
        this.reward = reward;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}