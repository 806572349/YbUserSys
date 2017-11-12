package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_points")
public class YbUserPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 当前积分
     */
    @Column(name = "current_points")
    private Integer currentPoints;

    /**
     * 当前事件所需要或者所产生积分，有正负
     */
    @Column(name = "event_points")
    private Integer eventPoints;

    /**
     * 事件ID
     */
    @Column(name = "event_id")
    private Integer eventId;

    /**
     * 本次积分是增加还是减少，0为负，1为正
     */
    @Column(name = "event_sign")
    private Integer eventSign;

    /**
     * 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    @Column(name = "event_type")
    private Integer eventType;

    /**
     * 积分事件发生时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 积分添加或者减少备注
     */
    @Column(name = "event_desc")
    private String eventDesc;

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
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取当前积分
     *
     * @return current_points - 当前积分
     */
    public Integer getCurrentPoints() {
        return currentPoints;
    }

    /**
     * 设置当前积分
     *
     * @param currentPoints 当前积分
     */
    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    /**
     * 获取当前事件所需要或者所产生积分，有正负
     *
     * @return event_points - 当前事件所需要或者所产生积分，有正负
     */
    public Integer getEventPoints() {
        return eventPoints;
    }

    /**
     * 设置当前事件所需要或者所产生积分，有正负
     *
     * @param eventPoints 当前事件所需要或者所产生积分，有正负
     */
    public void setEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
    }

    /**
     * 获取事件ID
     *
     * @return event_id - 事件ID
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * 设置事件ID
     *
     * @param eventId 事件ID
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取本次积分是增加还是减少，0为负，1为正
     *
     * @return event_sign - 本次积分是增加还是减少，0为负，1为正
     */
    public Integer getEventSign() {
        return eventSign;
    }

    /**
     * 设置本次积分是增加还是减少，0为负，1为正
     *
     * @param eventSign 本次积分是增加还是减少，0为负，1为正
     */
    public void setEventSign(Integer eventSign) {
        this.eventSign = eventSign;
    }

    /**
     * 获取事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     *
     * @return event_type - 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     *
     * @param eventType 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取积分事件发生时间
     *
     * @return create_time - 积分事件发生时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置积分事件发生时间
     *
     * @param createTime 积分事件发生时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取积分添加或者减少备注
     *
     * @return event_desc - 积分添加或者减少备注
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * 设置积分添加或者减少备注
     *
     * @param eventDesc 积分添加或者减少备注
     */
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }
}