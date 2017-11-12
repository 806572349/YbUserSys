package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_login_log")
public class YbUserLoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    private String mac;

    private Integer valid;

    /**
     * 浏览器
     */
    private String broswer;

    /**
     * 登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录方式    1.App  2.PC
     */
    @Column(name = "login_mode")
    private Integer loginMode;

    /**
     * 登录时间
     */
    @Column(name = "login_Time")
    private Date loginTime;

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
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * @param mac
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * @return valid
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * 获取浏览器
     *
     * @return broswer - 浏览器
     */
    public String getBroswer() {
        return broswer;
    }

    /**
     * 设置浏览器
     *
     * @param broswer 浏览器
     */
    public void setBroswer(String broswer) {
        this.broswer = broswer;
    }

    /**
     * 获取登录IP
     *
     * @return login_ip - 登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录IP
     *
     * @param loginIp 登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录方式    1.App  2.PC
     *
     * @return login_mode - 登录方式    1.App  2.PC
     */
    public Integer getLoginMode() {
        return loginMode;
    }

    /**
     * 设置登录方式    1.App  2.PC
     *
     * @param loginMode 登录方式    1.App  2.PC
     */
    public void setLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
    }

    /**
     * 获取登录时间
     *
     * @return login_Time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}