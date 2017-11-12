package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user")
public class YbUser {
    /**
     * ID主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户名
     */
    private String username;

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
     * 登陆时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 设备编号，用于推送
     */
    @Column(name = "device_code")
    private String deviceCode;

    /**
     * 头像地址
     */
    private String headimgurl;

    /**
     * 用户等级,1表示注册中，3表示普通用户，10表示认证通过用户
     */
    @Column(name = "user_level")
    private Integer userLevel;

    /**
     * 用户全局唯一编码
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 用户通过注册的方式,ANDROID,IOS,H5,WAP
     */
    @Column(name = "user_reg_way")
    private String userRegWay;

    /**
     * 预置INT
     */
    @Column(name = "extra_int")
    private Integer extraInt;

    /**
     * 预置double
     */
    @Column(name = "extra_double")
    private Double extraDouble;

    /**
     * 预置STING
     */
    @Column(name = "extra_string")
    private String extraString;

    /**
     * 获取ID主键
     *
     * @return id - ID主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID主键
     *
     * @param id ID主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取登陆时间
     *
     * @return login_time - 登陆时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登陆时间
     *
     * @param loginTime 登陆时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取设备编号，用于推送
     *
     * @return device_code - 设备编号，用于推送
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 设置设备编号，用于推送
     *
     * @param deviceCode 设备编号，用于推送
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * 获取头像地址
     *
     * @return headimgurl - 头像地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像地址
     *
     * @param headimgurl 头像地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取用户等级,1表示注册中，3表示普通用户，10表示认证通过用户
     *
     * @return user_level - 用户等级,1表示注册中，3表示普通用户，10表示认证通过用户
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级,1表示注册中，3表示普通用户，10表示认证通过用户
     *
     * @param userLevel 用户等级,1表示注册中，3表示普通用户，10表示认证通过用户
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取用户全局唯一编码
     *
     * @return user_code - 用户全局唯一编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户全局唯一编码
     *
     * @param userCode 用户全局唯一编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取用户通过注册的方式,ANDROID,IOS,H5,WAP
     *
     * @return user_reg_way - 用户通过注册的方式,ANDROID,IOS,H5,WAP
     */
    public String getUserRegWay() {
        return userRegWay;
    }

    /**
     * 设置用户通过注册的方式,ANDROID,IOS,H5,WAP
     *
     * @param userRegWay 用户通过注册的方式,ANDROID,IOS,H5,WAP
     */
    public void setUserRegWay(String userRegWay) {
        this.userRegWay = userRegWay;
    }

    /**
     * 获取预置INT
     *
     * @return extra_int - 预置INT
     */
    public Integer getExtraInt() {
        return extraInt;
    }

    /**
     * 设置预置INT
     *
     * @param extraInt 预置INT
     */
    public void setExtraInt(Integer extraInt) {
        this.extraInt = extraInt;
    }

    /**
     * 获取预置double
     *
     * @return extra_double - 预置double
     */
    public Double getExtraDouble() {
        return extraDouble;
    }

    /**
     * 设置预置double
     *
     * @param extraDouble 预置double
     */
    public void setExtraDouble(Double extraDouble) {
        this.extraDouble = extraDouble;
    }

    /**
     * 获取预置STING
     *
     * @return extra_string - 预置STING
     */
    public String getExtraString() {
        return extraString;
    }

    /**
     * 设置预置STING
     *
     * @param extraString 预置STING
     */
    public void setExtraString(String extraString) {
        this.extraString = extraString;
    }
}