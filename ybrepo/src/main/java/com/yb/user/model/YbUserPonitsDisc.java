package com.yb.user.model;

import javax.persistence.*;

@Table(name = "yb_user_ponits_disc")
public class YbUserPonitsDisc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    @Column(name = "type_desc")
    private String typeDesc;

    /**
     * 积分值
     */
    private Integer value;

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
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     *
     * @return type_desc - 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * 设置事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     *
     * @param typeDesc 事件类型0、首次注册赠送积分，1、表示连续登陆签到奖励，2、表示�
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    /**
     * 获取积分值
     *
     * @return value - 积分值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置积分值
     *
     * @param value 积分值
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}